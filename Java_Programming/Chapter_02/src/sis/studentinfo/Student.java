package sis.studentinfo;

import java.io.Serializable;
import java.util.*;

import java.util.logging.*; // 로그 관련 임포트 
import com.sun.scenario.animation.SplineInterpolator; // 라인세퍼레이터 임포

import sis.studentinfo.Student.GRADE; // enum static 임포

public class Student implements Serializable{ //다른 패키지에서 import 해서 참조할수있도록  public 으로 접근제어자를 변경한다.
	
	private String name;
	private String firstName = ""; // 미들네임이나,퍼스트네임은 없을수있음으로 빈값을 추가함. 
	private String middleName = "";
	private String lastName;
	private int maximumNumberOfNameParts = 3; // 학생 이름 음절제한  
	
	private String id;
	private int idNumber;
	
	private int credits;
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	static final String IN_STATE = "CO"; // 지역 관
	private String state="";
	public boolean isInState; // 지역관
	private ArrayList<GRADE> grades = new ArrayList<GRADE>(); // 학점 평균 계산 관 //얘는 왜 어레이리스트로 선언한걸
	
	static int MAX_NAME_PARTS = 3; //  이름 글자수 제한 에러메시지 관련
	static final String TOO_MANY_NAME_PARTS_MSG = "Student name '%s' Contains more than %d parts"; // 에러메시지 상수
	private List<Integer> charges = new ArrayList<Integer>();
	
	final static Logger logger = Logger.getLogger(Student.class.getName());  // 로그 보내는 기능
	
	////각학생에게 퍼스안에 사는지,세금을 면제받는지, 미성년인지, 문제학생인지를 물어는 내용에 대한 enum 및 메소
	public enum Flag { 
		ON_CAMPUS(1), TAX_EXEMPT(2), MINOR(4), TROUBLEMAKER(8);
	
		private int mask;
		
		Flag(int mask){
			this.mask = mask;
		}
	}
	
	private int setting = 0x0;
	
	public void set(Flag...flags){
		for(Flag flag : flags){
			setting &= ~flag.mask; // 이건 무엇일까 
		}
	}
	
	public void unset(Flag...flags){
		for(Flag flag:flags){
			setting &= ~flag.mask;
		}
	}
	
	public boolean isOn(Flag flag){
		return (setting & flag.mask) == flag.mask;
	}
	
	public boolean isOff(Flag flag){
		return !isOn(flag);
	}
	// 여기까지 
	
	
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
		
		if(nameParts.size() > maximumNumberOfNameParts){
			String message = String.format(Student.TOO_MANY_NAME_PARTS_MSG, fullName, MAX_NAME_PARTS); //  위에서 선언한 상수화한에러메시지를 가져와서 포멧팅한다.
			Student.logger.info(message);
			throw new StudentNameFormatException(message);
		}
		setName(nameParts);
		idNumber++;
		id = String.valueOf(idNumber);
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
		//grades = new ArrayList<GRADE>(); //계속 배열에 저장되기때문에 test 메소드에서 각 등급별로 점수확인하는거면
					// 메소드 호출할때마다 초기화되야하는거 아닌가 ???
		grades.add(grade);
	}

	double getGpa(){
		Student.logger.fine("begin getGpa "+System.currentTimeMillis());
		if(grades.isEmpty())
			return 0.0;
		double total = 0.0;
		for(GRADE grade:grades){
			total += gradingStrategy.getGradePointsFor(grade);
		}
		double results = total/grades.size();
		Student.logger.fine("end getGpa "+ System.currentTimeMillis());
		return results;
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

	public static Student findByLastName(String lastName2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	//문제있는 부분 구현  
	
	
	
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id ;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	
			
	
}
