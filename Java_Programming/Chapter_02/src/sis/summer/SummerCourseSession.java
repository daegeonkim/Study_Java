package sis.summer;

import sis.studentinfo.*;
import java.util.*;

public class SummerCourseSession extends CourseSession {
	public static CourseSession create(String department, String number, Date startDate){
		return new SummerCourseSession(department, number, startDate);
	}
	
	
	private SummerCourseSession(String department, String number, Date startDate){ // 생성
		super(department, number, startDate); // ???
	}
	
	@Override
	protected int getSessionEndDate(){ // 아래에 getEndDate 메소드에 시즌 길이값을 위해 생성된 메소드  
		return 8;
	}
	
	@Override
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int sessionLength = getSessionEndDate();
		int daysInWeek = 7;
		int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength*daysInWeek-daysFromFridayToMonday;
		
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
	
}
