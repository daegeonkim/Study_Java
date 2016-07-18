package studentinfo;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import sun.util.calendar.Gregorian;



public class CourseSessionTest extends TestCase{ //강의의 기본 과목정보와 수강정보를 관리하기 위해생
	//department  :학과
	// number :  과목번
	private CourseSession session;
	private Date startDate;
	
	public void setUp(){
		startDate = createDate(2003, 1, 6);
		session = new CourseSession("ENGL", "101", startDate);
	}
	Date createDate(int year, int month, int date){ // Calendar 객체 생성시 더 편하게 작성할수있도록해
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(calendar.YEAR, year);
		calendar.set(calendar.MONTH, month-1);
		calendar.set(calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
		
		
		//ㄴ Calendar 1900, 0부터 시작하는등 가시적으로 좀더 편하게 작성할수있도록 리턴함
		// 그런데 얘가 사용되려면 메소드를 먼저 한번 사용해야하는거아닌가 ..?
		// ㄴ startDate = 에 할당하면된다!
		
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
		assertEquals(2, session.getNumberOfStudents());
		// 아래부터 원하는 학생이 있는지 확인하기 위한 코드 
		//assertEquals(2, allStudents.size());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
				
	}
	
	public void testCourseDates(){
		CourseSession session = new CourseSession("ABCD", "200", startDate);
		
		Date sixteenWeeksOut = createDate(2003,4,25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
		
		
		
	}
}	
