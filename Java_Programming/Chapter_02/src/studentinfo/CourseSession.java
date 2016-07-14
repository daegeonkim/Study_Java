package studentinfo;

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

	Student get(int index) {

		return students.get(index); 
		//Array <  > 생성자를 만들어 enroll 메소드로 여기 필드값 students 에 값을 추가하고
		// getAllStudents 로 리턴을받아 출력했으나, Coursesession 으로 객체를 만들면 어차피 초기화되는부분이라 없애고 해당 메소드를 만드는거같다
		//ㄴ 햇갈려서 한 헛소리다 Array 형 변수가 없는데 어떻게 리턴받아서 출력하냐
		// 지우는 이유는 정말 필요없어서다
		// 책에서는 '현재는 학생의 전체리스트를 가져올 필요가없음으로' 라고한
	}

	
	

}
