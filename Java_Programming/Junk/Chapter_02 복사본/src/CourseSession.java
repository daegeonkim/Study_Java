
class CourseSession {
	private String department;
	private String number;
	//private int numberOfStudents; 
		//인수화된 형의 객체에서(배열인거같다) 사이즈를 체크할수있음으로 이 필드는 더이상 필요없다.
	private java.util.ArrayList<Student> students = new java.util.ArrayList<Student> (); //???
	
	
	CourseSession(String department, String number){
		this.department = department;
		this.number = number;

	}

	String getDepartment() {
		return department;
	}

	String getNumber() {
		return number;
	}

	int getNumberOfStudents() {
		return students.size(); // 얘가 enroll, numberOfStudent, 의 자리를 대신한
	}
	
	void enroll(Student student){ //매개변수로 생성된 학생을 받고 생성될때마
		students.add(student);
	}
	
	java.util.ArrayList<Student> getAllStudents(){
		return students;//??
		
	}
	
	

}
