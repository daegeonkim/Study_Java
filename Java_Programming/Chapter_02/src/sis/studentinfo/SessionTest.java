package sis.studentinfo;

import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.util.*;
import static sis.studentinfo.DateUtil.createDate;




abstract public class SessionTest extends TestCase {
	private Session session;
	private Date startDate;
	
	public static final int CREDITS = 3;
	
	public void setUp(){
		startDate = createDate(2003, 1, 6);
		session = createSession(new Course("ENGL", "101"), startDate);
		session.setNumberOfCredits(CREDITS);
	}
	
	abstract protected Session createSession(Course course, Date startDate); // 난 이걸 왜하는지 아직도 모르겠다.
	
	public void testCreate (){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(startDate, session.getStartDate());
	}
	
	public void testEnrollStudents(){
		Student student1 = new Student("Dennis Kim");
		session.enroll(student1);
		assertEquals(CREDITS, student1.getCredits());
		assertEquals(student1, session.get(0));
		
		Student student2 = new Student("Dennis Kim");
		session.enroll(student2);
		assertEquals(CREDITS, student2.getCredits());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
	
	public void testComparable(){
		final Date date = new Date();
		Session sessionA = createSession(new Course("CMSC", "101"), date);
		Session sessionB = createSession(new Course("ENGL", "101"), date);
		assertTrue(sessionA.compareTo(sessionB)<0);
		assertTrue(sessionB.compareTo(sessionA)>0);
		Session sessionC = createSession(new Course("CMSC", "101"), date);
		assertEquals(0, sessionC.compareTo(sessionC));

		Session sessionD = createSession(new Course("CMSC", "210"), date);
		assertTrue(sessionC.compareTo(sessionD)<0);
		assertTrue(sessionD.compareTo(sessionC)>0);
	}

	public void testAverageGpaForPartTimeStudents(){
		session.enroll(createFullTimeStudent());
		Student partTime1 = new Student("1");
		
		partTime1.addGrade(Student.GRADE.A);
		session.enroll(partTime1);
		
		session.enroll(createFullTimeStudent());
		
		Student partTime2 = new Student("2");
		partTime2.addGrade(Student.GRADE.B);
		System.out.println("B is "+Student.GRADE.B.getPoints());
		System.out.println("A is "+ Student.GRADE.A.getPoints());
		session.enroll(partTime2);

		assertEquals(3.5, session.averageGpaForPartTimeStudents());
	}
	
	private Student createFullTimeStudent(){
		Student student = new Student("a");
		student.addCredits(Student.CREDITS_REQUIRED_FOR_FULL_TIME);
		return student;
	}
	
	public void testIterate(){
		enrollStudents(session);
		
		List<Student> results = new ArrayList<Student>();
		
		
		
		for(Student student: session){ // 실제적으로  enroll 한 값은 session 에 students 로 저장되는거니까, session.students 로 적어야하는거아닌가 ??
			results.add(student);		// session.students 로 했을때 정상패스됨. 접근제어자 private 지만 테스트를 위해서  public 으로바꿔실험함.
		}
		assertEquals(session.getAllStudents(), results);
	}
	
	private void enrollStudents(Session session){
		session.enroll(new Student("1"));
		session.enroll(new Student("2"));
		session.enroll(new Student("3"));
	}	
	
	public void testCasting(){
		List students = new ArrayList();
		students.add(new Student("A"));
		students.add(new Student("B"));

		List names = new ArrayList();
		
		Iterator it = students.iterator();
		while(it.hasNext()){
			Student student = (Student)it.next();
			names.add(student.getLastName());
		}
		assertEquals("A", names.get(0));
		assertEquals("B", names.get(1));
	}
	
	
	public void testCharge(){
		Student student = new Student("A");
		student.addCharge(500);
		student.addCharge(200);
		student.addCharge(399);
		assertEquals(1099, student.totalCharges());
	}
	
	public void testSessionUrl() throws SessionException{
		final String url = "http://course.langrsoft.com/cmsc300";
		session.setUrl(url);
		assertEquals(url, session.getUrl().toString());
	}
	
	public void testInvaoldSessionUrl(){
		final String url = "httsp://course.langrsoft.com/cmsc300";
		try{
			session.setUrl(url);
			fail("expected exception due to invaild protocol in URL");
		}
		catch(SessionException expectedException){
			Throwable cause = expectedException.getCause();
			assertEquals(MalformedURLException.class, cause.getClass());
		}
	}
	
	
	
	public void testBadlyFormattedName(){  //  이름이 정해진 음절 이상인경우 예외를 발생하는지 확인하는 테스트 메소드 
		try{
			new Student("a b c d");
			fail("expected exception from 4-part name");
		}
		catch(StudentNameFormatException exceptedException){
			assertEquals("Student name 'a b c d' Contains more than 3 parts",
					exceptedException.getMessage());
			
		}
	}

}
