package sis.studentinfo;

import java.sql.Array;
import java.util.*;

import com.sun.scenario.animation.SplineInterpolator;

import sis.studentinfo.Student.GRADE;

public class Student { //다른 패키지에서 import 해서 참조할수있도록  public 으로 접근제어자를 변경한다.
	
	private String name;
	private String firstName = ""; // 미들네임이나,퍼스트네임은 없을수있음으로 빈값을 추가함. 
	private String middleName = "";
	private String lastName;
	
	
	private int credits;
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	static final String IN_STATE = "CO"; // 지역 관
	private String state="";
	public boolean isInState; // 지역관
	public static ArrayList<GRADE> grades = new ArrayList<GRADE>(); // 학점 평균 계산 관 //얘는 왜 어레이리스트로 선언한걸
	
	private List<Integer> charges = new ArrayList<Integer>();
	
	
	
	public enum GRADE {
		A(4), B(3), C(2), D(1), F(0);
		private int points;
		
		GRADE(int points){ // 생성자 
			this.points = points;
			}
		
		int getPoints(){ // 메소드 //생성시 인수로받았던 포인트 리턴  
			return points;
			}
		}
	 
	
	void setState(String state){
		this.state = state; // 지역관련 
	}
	
	
	public Student(String fullName) {
		this.name = fullName;
		credits= 0;
		List<String> nameParts = split(fullName); // 너는 누구냐  팩토리 메소드의 일종이 될것이니 ?
		setName(nameParts);
		
	}
	

	
	
	// 이름관련  
	public String getName(){
		return name;
	}
	
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return middleName;
	}


	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}


	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
	
	private void setName(List<String> nameParts){
		this.lastName = removeLastName(nameParts);
		String name = removeLastName(nameParts);
		if(nameParts.isEmpty()){
			this.firstName = name;
		}
		else{
			this.middleName = name;
			this. firstName = removeLastName(nameParts);
		}

		
	}
	
	private String removeLastName(List<String> list){ //???
		if(list.isEmpty())
			return "";
		return list.remove(list.size() -1);
	}
	
	private List<String> split(String fullName){
		List<String> results = new ArrayList<String>();
		for(String name:fullName.split(" ")){
			results.add(name);
		}
		return results;
	}
		
	
	
	
	
	
	
	
	boolean isFullTime(){
		return credits >=CREDITS_REQUIRED_FOR_FULL_TIME;
	}
	
	int getCredits(){
		return credits;
	}
	
	void addCredits(int credits){
		this.credits += credits;
	}

	boolean isInState(){ // 지역관련 
		return state.equals(Student.IN_STATE);
	}
	
	void addGrade(GRADE grade){
		grades = new ArrayList<GRADE>(); //계속 배열에 저장되기때문에 test 메소드에서 각 등급별로 점수확인하는거면
					// 메소드 호출할때마다 초기화되야하는거 아닌가 ???
		
		grades.add(grade);
	}

	double getGpa(){
		if(grades.isEmpty())
			return 0.0;
		double total = 0.0;
		for(GRADE grade:grades){
			total += gradingStrategy.getGradePointsFor(grade);
		}
		return total;
	}
	
	private GradingStrategy gradingStrategy = new BasicGradingStrategy(); // 객체를 생성했을때는 일반학생으로 초기화(?)
	
	void setGradingStrategy (GradingStrategy gradingStrategy){ // 인터페이스를 인수로 받는경우는 구현하는클래스 받는다는 의미인듯.
		this.gradingStrategy = gradingStrategy; // 인수로 받은 구현클래스로 객체를 설정하는거같은데 뭔지모르겠
	}
	
	
	private Student createHonorsStudent(){
		Student student = new Student("a");
		student.setGradingStrategy(new HonorsGradingStrategy());
		return student;
	}


	public void addCharge(int charge) {
		charges.add(charge);		
	}
	
	public int totalCharges(){
		int total = 0;
		for(int charge : charges){
			total += charge;
		}
		return total;
	}
	
	
			
	
}
