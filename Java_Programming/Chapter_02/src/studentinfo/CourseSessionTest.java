package studentinfo;
import junit.framework.TestCase;
import java.util.ArrayList;


public class CourseSessionTest extends TestCase{ //강의의 기본 과목정보와 수강정보를 관리하기 위해생
	//department  :학과
	// number :  과목번
	private CourseSession session;
	
	public void setUp(){
		session = new CourseSession("ENGL", "101");
	}
	
	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
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
}	
