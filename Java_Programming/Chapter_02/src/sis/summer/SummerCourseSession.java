package sis.summer;

import sis.studentinfo.*;
import java.util.*;

public class SummerCourseSession extends Session {

	public static SummerCourseSession create(String department, String number, Date startDate){
		return new SummerCourseSession(department, number, startDate);	
	}
	
	
	private SummerCourseSession(String department, String number, Date startDate){ // 생성
		super(department, number, startDate); // ??? // 인자를 상위 생성자로 넘겨줌. 
	}
	
	
	protected int getSessionEndDate(){ // 아래에 getEndDate 메소드에 시즌 길이값을 위해 생성된 메소드  
		return 8;
	}

	
	@Override
	protected int getSessionLength(){
		return 8;
	}
	
}
