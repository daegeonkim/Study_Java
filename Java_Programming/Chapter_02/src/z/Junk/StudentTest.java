package z.Junk;

public class StudentTest extends junit.framework.TestCase{
	public void testCreate(){
		final String firstStudentName = "Jane Doe";
		final String secondStudentName = "John Snow";
		
		
	//	Student student = new Student("Jane Doe");// 해당 값에 스트링 값을 그냥 넣는건 좋지않다고 한다.. 
		Student student = new Student(firstStudentName); // 그래서 위에서 선언한 상수값을 대입한다 (수정시 편하게하려는건가)
//		String studentName = student.getName(); // 왜 스테틱으로 선언하라는걸까 어차피 스튜던트 클래스 내에서 사용하는건ㄷ[ ..
//		assertEquals("Jane Doe", studentName);
		assertEquals(firstStudentName,student.getName());
		
		
		Student secondStudent = new Student(secondStudentName);
//		String secondStudentName = secondStudent.getName();
//		assertEquals("John Snow", secondStudentName);  그냥 리턴받아온 getName메소드를 쓰면 더효율적이다.
	
		assertEquals(secondStudentName , secondStudent.getName());
	}
}

class Student{
	String name;
	
	public Student(String name){ // 원
		this.name = name;
	}
	String getName(){ //  얘는 퍼블릭이 아닌데 괜찮은건가 ??
		return name;
		
	}
}