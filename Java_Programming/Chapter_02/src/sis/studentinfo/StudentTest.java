
package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	private static final double GRADE_TOLERANCE = 0.5;

	public void testCreate() {
	final String firstStudentName = "Jane Doe";
	Student firstStudent = new Student(firstStudentName);
	assertEquals("Jane", firstStudent.getFirstName());
	assertEquals("Doe", firstStudent.getLastName());
	assertEquals("", firstStudent.getMiddleName());
	
	final String secondStudentName = "Blow";
	Student secondStudent = new Student(secondStudentName);
	assertEquals("", secondStudent.getFirstName());
	assertEquals("Blow", secondStudent.getLastName());
	assertEquals("", secondStudent.getMiddleName());
	
	final String thirdStudentName = "Raymond Douglass Davies";
	Student thirdStudent = new Student(thirdStudentName );
	assertEquals("", thirdStudent.getFirstName());
	assertEquals("Blow", thirdStudent.getLastName());
	assertEquals("", thirdStudent.getMiddleName());
	}
	
	public void testStudentStatus(){
		Student student = new Student("A");
		assertEquals(0, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(4);
		assertEquals(7, student.getCredits());
		assertFalse(student.isFullTime());

		student.addCredits(5);
		assertEquals(student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
		assertTrue(student.isFullTime());
	}
	
	public void testInstat(){
		Student student = new Student("A"); //객체 생
		assertFalse(student.isInState()); // 생성시 초기화되는 state 값 ""기때문에 False 로 확
		student.setState(Student.IN_STATE);// IN_STATE==CO 로 state 값을 초기화함.
		assertTrue(student.isInState()); // 리턴값은 IN_STATE 값이기때문에 참
		student.setState("MD"); // MD로 state 값을 초기
		assertFalse(student.isInState()); // siInstate 는 IN_STATE==CO값을 받기때문에 서로 달라 False 출력
	}
	
	public void testClaculateGpa(){
		Student student = new Student("a");
		assertGpa(student, 0.0);
		student.addGrade(Student.GRADE.A);
		assertGpa(student, 4.0);
		student.addGrade(Student.GRADE.B);
		assertGpa(student, 3.5);
		student.addGrade(Student.GRADE.C);
		assertGpa(student, 3.0);
		student.addGrade(Student.GRADE.D);
		assertGpa(student, 2.5);
		student.addGrade(Student.GRADE.F);
		assertGpa(student, 2.0);

	}
	private void assertGpa(Student student, double expectedGpa){
		assertEquals(expectedGpa, student.getGpa(), GRADE_TOLERANCE);
	}
	
	private Student createHonorsStudent(){ // 전공학생 만드는메소드인드
		Student student = new Student("A");
		student.setGradingStrategy(new HonorsGradingStrategy());
		return student;
		
	}
}
	