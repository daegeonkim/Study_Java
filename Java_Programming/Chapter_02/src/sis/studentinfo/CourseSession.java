package sis.studentinfo;
import java.util.*;


public class CourseSession extends Session{
	private static int count;
	

	protected CourseSession(Course course, Date startDate){
		super(course, startDate);	
	}
	
	public static Session create(Course course, Date startDate){
		incrementCount();
		return new CourseSession(course, startDate);	
	}
	
	
	static private int incrementCount(){ //객체가 생성될때마다 증가된 count 를 반환한다.
		return ++count; 
	}
	
	static int getCount(){ // 아래와같
		return count;	
	}
	
	static int resetCount(){ // 클래스변수 Count 를 private로 캡슐화 하면서 테스트메소드에서 직접적으로 0으로 초기화할수없어 메소드를 만듬.
		return count=0;
	}	
	
	@Override
	protected int getSessionLength() {
		return 16;
	}

	
}

