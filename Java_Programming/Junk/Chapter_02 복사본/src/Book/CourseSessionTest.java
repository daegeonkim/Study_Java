package Book;

import junit.framework.TestCase;

import java.util.ArrayList; 
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CourseSessionTest extends TestCase {
	
	private CourseSession session;//?
	private Date startDate;
	
	public void setup(){ // ? 
		int year = 103;
		int month = 0;
		int date = 6;
		startDate = new Date (year, month, date);
		session = new CourseSession("ENGL", "101"); //??
		
	}
	
	
	
	public void testCreate(){	
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment()); 
		assertEquals("101", session.getNumber());
		assertEquals(0,session.getNumberOfStudents());
	}	
	
	
	
	public void testEnrollStudents(){
		//CourseSession session = new CourseSession("ENGL", "101"); setup으로 각자의 객체를 가진다함...
		
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1); // 얘는 왜 null 포인트 에러가 발생하는가 ..
		assertEquals(1, session.getNumberOfStudents());
		
		//java.util.ArrayList<Student> allStudents = session.getAllStudents(); 이건 스트링을 Student의 레퍼런스에 할당하는것이 허용되지않
	//	java.util.ArrayList<Student> allStudents = new java.util.ArrayList<Student>(); // 요렇게 쓰는데 왠지 모르겠다 ...
		
		//assertEquals(1, allStudents.size()); // 모든 학생을 배열로 저장해서 배열사이즈로 체크를하려나봄. // 왜 갑자기 생략되는거지 ..?
		assertEquals(student1, session.get(0));
		
		
		Student student2 = new Student("Dennis Kim");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		//assertEquals(2, allStudents.size());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
	
	//java.utill.ArrayList<Student> allStudents = session.getAllStudents(); ?????

}

class CourseSession {
	String department;
	String number;
	//private int numberOfStudents = 0 ; //객체를 생성할때 마다  각 객체를 처음 만들었을때는 각자의 this.numberOfStudents 의 값은 0 으로 초기화된다. 
	private java.util.ArrayList<Student> students = new java.util.ArrayList<Student>();
	private Date startDate;
	
	
	public CourseSession(String department, String number){
		this.department = department;
		this.number = number;
	}

	CourseSession(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	
	
	
	public String getDepartment(){
		return department;
	}
	public String getNumber(){
		return number;
	}
	public int getNumberOfStudents(){
		return students.size();
	}
	void enroll(Student student){
//		numberOfStudents =numberOfStudents + 1 ;  얘를 아랫놈이 대체하나보다..
		students.add(student);// 얘는 뭘까 ..
	}
	
	java.util.ArrayList<Student> getAllStudents(){
		return students;
	}

	Student get(int index){
		return students.get(index); // 뭐지이건 ..?
	}
	
	public void testCourseDates(){
		int year = 103;
		int month =0;
		int date = 6;
		Date startDate = new Date(year, month, date); //year 은 year + 1900 , 0~ 11 사이의 월, 세번째는 1~31사이의 날짜를 나타낸다 .
														// year(103) = 2003, 0 이면 12월인가.. 얘는 왜 0 부터일까.6일 
														//얘는 왜 디프리케이트 된걸까 
		
		
		CourseSession session = new CourseSession("ABCD", "200", startDate);
		
		year = 103;
		month = 3;
		date = 25;
		Date sixteenWeeksOut = new Date (year, month, date); // 너는왜 ...
		//assertEquals(sixteenWeeksOut, session.getEndDate()); //?????왜 너는안되는거니 .????
	}
	
	Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 12*7-3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date endDate = calendar.getTime();
		return endDate;
		
	}
}
