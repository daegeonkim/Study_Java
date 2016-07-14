package studentinfo;
public class StudentTest extends junit.framework.TestCase {

	public void testCreate() {
		final String firstStudentName = "ABC"; // 문자열을 그대로 사용했을 경우 의미파악이나 수정이 어려울수있기때문에 상수로 교
		final String secondStudentName = "123"; // 또 중복적으로 사용되기때문에 상수로 교
		
		
		Student firstStudent = new Student(firstStudentName); // 교체한 상수값입력
		
		assertEquals(firstStudentName, firstStudent.getName()); // 생성한 객체에 직접 getName 할수있기때문에 
												//getName값을 할당한 지역변수는 제거한다.
		
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		
		assertEquals(secondStudentName, secondStudent.getName());
	}
	
}
	