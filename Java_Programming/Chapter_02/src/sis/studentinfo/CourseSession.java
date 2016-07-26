package sis.studentinfo;
import java.util.*;


public class CourseSession implements Comparable<CourseSession>{
	
	private String department;
	private String number;
	private Date startDate;
	private ArrayList<Student> students = new java.util.ArrayList<Student> (); //???
	
	private static int count=0;
	private int numberOfCredits; // test.CREDIT 으로 부터 Student 로 가는 학점 
	
	
	static final String NEWLINE= System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE+"-" + NEWLINE;
	static final String ROSTER_REPORT_FOOTER = NEWLINE+"# Students";
	
	public CourseSession(){
		
	}
	public CourseSession(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
		
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	int getNumberOfStudents() {
		return students.size(); // 얘가 `enroll, numberOfStudent, 의 자리를 대신한
	}
	
	public void enroll(Student student){ //매개변수로 생성된 학생을 받고 생성될때마
		student.addCredits(numberOfCredits); // 테스터로 부터 온 Credit 을 학생의 credit 으로 설정해
		students.add(student); 	//학생의 총 학점 등등 확인할때 사용할듯 .
	}
	
	public ArrayList<Student> getAllStudents(){
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
	
	Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays= 16*7-3; //강의의 마지막날이 16주차의 금요일이기때문에 3일을 뺀다 
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays); //DAY_OF_YEAR는 import Calendar 클래스의 상수 
		
		return calendar.getTime();
	}

	Date getStartDate() {
		return startDate;
	}
	
	static int getCount(){ // 아래와같
		return count;	
	}
	
	static int resetCount(){ // 클래스변수 Count 를 private로 캡슐화 하면서 테스트메소드에서 직접적으로 0으로 초기화할수없어 메소드를 만듬.
		return count=0;
	}
	static int incrementCount(){ //객체가 생성될때마다 증가된 count 를 반환한다.
		return ++count; 
	}
	
	public static CourseSession create(String department, String number, Date startDate){
		incrementCount(); // 스태틱 코드 내에서 스태틱변수에 대한 증감을 처리하는것이 훨씬 좋아보인다고한다.
		return new CourseSession(department, number, startDate);
		
	}
	
	void setNumberOfCredit(int numberOfCredits) { //test로부터 받은 크레딧을 student 객체로 가는 NumberOfCredit으로 설
		this.numberOfCredits = numberOfCredits;
	}
	
	@Override
	public int compareTo(CourseSession that) {
		int compare = this.getDepartment().compareTo(that.getDepartment()); //  과 이름으로 먼저 확인흘하
		if(compare == 0){ // 서로 강의 과목이 같은강요 
			compare = this.getNumber().compareTo(that.getNumber()); // getNumber 을 통해 가져온강의 번호순으로 나열한
		}
		return compare;
	}
	
	
}

