package sis.summer;

import junit.framework.*;
import java.util.*;
import sis.studentinfo.*;

public class SummerCourseSessionTest extends SessionTest{
	
	public void testEndDate(){
		Date startDate = DateUtil.createDate(2003, 6, 9);
		Session session = createSession("ENGL", "200", startDate);
		Date eightWeeksOut = DateUtil.createDate(2003, 8, 1);
		assertEquals(eightWeeksOut, session.getEndDate());
		
	}

	@Override
	protected Session createSession(String department, String number, Date startDate) {
		return SummerCourseSession.create(department, number, startDate); // 각 확장 클래스마다 create 팩토리메소드로 해당되는 객체를 만들어서
											// 그 객체에 해당하는 메소드를 사용하게함.
	}

}
