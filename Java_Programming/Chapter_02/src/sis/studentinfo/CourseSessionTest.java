package sis.studentinfo;


import static sis.studentinfo.DateUtil.createDate;

import java.util.Date;
import java.util.GregorianCalendar;
import junit.framework.TestCase;


public class CourseSessionTest extends SessionTest{ //강의의 기본 과목정보와 수강정보를 관리하기 위해생

	public void testCreate(){
		Date startDate = DateUtil.createDate(2003, 1, 6);
		Session session = createSession("ENGL", "200", startDate);
		Date sixteemWeeksOut = createDate(2003, 4, 25);
		assertEquals(sixteemWeeksOut, session.getEndDate());
	}	

	public void testCount(){
		CourseSession.resetCount(); //다른곳에서도 객체가 생성될때마다 클래스변수 +1 되기때문에 이 테스트를 하기위해실행전 0으로 초기화한다 
		createSession("", "", new Date());
		assertEquals(1, CourseSession.getCount());
		createSession("", "", new Date());
		assertEquals(2, CourseSession.getCount());

	}
	
	@Override

	protected Session createSession(String department, String number, Date startDate) {
		return CourseSession.create(department, number, startDate);
	}


	
	
	
}
	
	
