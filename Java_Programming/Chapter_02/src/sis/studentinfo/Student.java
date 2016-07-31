package sis.studentinfo;

import java.util.ArrayList;

import sis.studentinfo.Student.GRADE;

public class Student { //다른 패키지에서 import 해서 참조할수있도록  public 으로 접근제어자를 변경한다.
	private String	name;
	private int credits;
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	
	static final String IN_STATE = "CO"; // 지역 관
	private String state="";
	public boolean isInState; // 지역관
	public static ArrayList<GRADE> grades = new ArrayList<GRADE>(); // 학점 평균 계산 관 //얘는 왜 어레이리스트로 선언한걸
	
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
	
	
	public Student(String name) {
		this.name = name;
		credits= 0;
	}
	
	
	public String getName(){
		return name;
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
	/*int gradePointsFor(GRADE grade){
		if (isSenatorsSon){
			if(grade == GRADE.A) return 4;
			if (grade == GRADE.B) return 4;
			if (grade == GRADE.C) return 4;
			if (grade == GRADE.D) return 4;
			return 3;

		
		
		int points = basicGradePointsFor(grade);
		if (isHonors){
			if (points > 0){
				points += 1;
			}
		}
		return 0; //그 외의경우 0 리턴	
	}*/
	
	
	private GradingStrategy gradingStrategy = new BasicGradingStrategy(); // 객체를 생성했을때는 일반학생으로 초기화(?)
	
	void setGradingStrategy (GradingStrategy gradingStrategy){ // 인터페이스를 인수로 받는경우는 구현하는클래스 받는다는 의미인듯.
		this.gradingStrategy = gradingStrategy; // 인수로 받은 구현클래스로 객체를 설정하는거같은데 뭔지모르겠
	}
	
	
	private Student createHonorsStudent(){
		Student student = new Student("a");
		student.setGradingStrategy(new HonorsGradingStrategy());
		return student;
	}

}
