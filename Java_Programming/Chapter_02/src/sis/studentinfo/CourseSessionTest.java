package sis.studentinfo;
import java.util.Date;
import java.util.GregorianCalendar;
import junit.framework.TestCase;


public class CourseSessionTest extends TestCase{ //강의의 기본 과목정보와 수강정보를 관리하기 위해생
	//department  :학과
	// number :  과목번
	private CourseSession session;
	private Date startDate;
	private static final int CREDITS =3; // 왜 3일까 
	
	public void setUp(){
		startDate = DateUtil.createDate(2003, 1, 6);
		session = createCourseSession();
		
		

	}
	
	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
		
	}
	
	public void testEnrollStudents(){ //학생들이 강의를 신청할수 있는지 확인한다.
		
		Student student1 = new Student("Dennis");
		session.enroll(student1); // 학생을 참여시키는거인
		assertEquals(CREDITS, student1.getCredits());
		assertEquals(1, session.getNumberOfStudents());// 참여후 해당 학과에 몇명이 참여중인지 확인
		
		// 아래부터 원하는 학생이 있는지 확인하기 위한 코드 
		
		//ArrayList<Student> allStudents = session.getAllStudents();  //Coursesession에서 해당 객체가있어서 
															//이유는 get 메소드참
		// 이친구가 Student 형의 객체만 저장할수있도록 인수화된 형식을 사용하는건 알겠는데 
		// getAllStudents 의 정체를 모르겠다 ..
		assertEquals(student1, session.get(0));//원하는 학생이 해당 인덱스에 있는지 확인할때도	
										// 굳이 모든 학생 리스트를 불러올필요없다

		
		Student student2 = new Student("Kim");
		session.enroll(student2);
		assertEquals(CREDITS, student2.getCredits());
		assertEquals(2, session.getNumberOfStudents());
		// 아래부터 원하는 학생이 있는지 확인하기 위한 코드 
		//assertEquals(2, allStudents.size());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
				
	}
	
	public void testCourseDates(){// 과목, 번호, 시작 날짜객체에 종강날짜를 계산하는 메소드가 정상 실행되는지 확인하는 메소
		CourseSession session = new CourseSession("ABCD", "200", startDate);
		
		Date sixteenWeeksOut = DateUtil.createDate(2003,4,25); //인스턴스화 하지 않은 객체를 일시적으로 만들어필요할때마다 참조시킴 
		assertEquals(sixteenWeeksOut, session.getEndDate());
		
	}

	public void testCount(){
		CourseSession.resetCount(); //다른곳에서도 객체가 생성될때마다 클래스변수 +1 되기때문에 이 테스트를 하기위해실행전 0으로 초기화한다 
		createCourseSession();
		assertEquals(1, CourseSession.getCount());
		createCourseSession();
		assertEquals(2, CourseSession.getCount());

	}
	private CourseSession createCourseSession(){
		CourseSession session =  CourseSession.create("ENGL", "101", startDate);
		session.setNumberOfCredit(CourseSessionTest.CREDITS);
		return session;
		
	}
	
	public void testStringCompareTo(){
		assertTrue("A".compareTo("B") < 0);
		assertEquals(0, "A".compareTo("A"));
		assertTrue("B".compareTo("A")>0);
		
	}
	public void testComparable(){
		final Date date = new Date();
		CourseSession sessionA = CourseSession.create("CMSC", "101", date);
		CourseSession sessionB = CourseSession.create("ENGL", "101", date);
		assertTrue(sessionA.compareTo(sessionB) < 0 );
		assertTrue(sessionB.compareTo(sessionA) > 0 );	
		CourseSession sessionC = CourseSession.create("CMSC", "101", date);
		assertEquals(0, sessionA.compareTo(sessionC));
		
		CourseSession sessionD = CourseSession.create("CMSC", "210", date);
		assertTrue(sessionC.compareTo(sessionD) < 0);
		assertTrue(sessionD.compareTo(sessionC) > 0);
	
	
	
	
	}
	
	
}
	
	
