package sis.studentinfo;

public class Student { //다른 패키지에서 import 해서 참조할수있도록  public 으로 접근제어자를 변경한다.
	

	private String	name;
	private int credits;
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	
	static final String IN_STATE = "CO"; // 지역 관
	private String state="";
	public boolean isInState;
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
	

}
