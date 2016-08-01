package sis.studentinfo;

import junit.framework.TestCase;
import java.util.*;
import static sis.studentinfo.DateUtil.createDate;




abstract public class SessionTest extends TestCase {
	private Session session;
	private Date startDate;
	
	public static final int CREDITS = 3;
	
	public void setUp(){
		startDate = createDate(2003, 1, 6);
		session = createSession("ENGL", "101", startDate);
		session.setNumberOfCredits(CREDITS);
	}
	
	abstract protected Session createSession(String department, String number, Date startDate); // 난 이걸 왜하는지 아직도 모르겠다.
	
	public void testCreate (){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(startDate, session.getStartDate());
	}
	
	public void testEnrollStudents(){
		Student student1 = new Student("Dennis Kim");
		session.enroll(student1);
		assertEquals(CREDITS, student1.getCredits());
		assertEquals(student1, session.get(0));
		
		Student student2 = new Student("Dennis Kim");
		session.enroll(student2);
		assertEquals(CREDITS, student2.getCredits());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
	
	public void testComparable(){
		final Date date = new Date();
		Session sessionA = createSession("CMSC", "101", date);
		Session sessionB = createSession("ENGL", "101", date);
		assertTrue(sessionA.compareTo(sessionB)<0);
		assertTrue(sessionB.compareTo(sessionA)>0);
		Session sessionC = createSession("CMSC", "101", date);
		assertEquals(0, sessionC.compareTo(sessionC));

		Session sessionD = createSession("CMSC", "210", date);
		assertTrue(sessionC.compareTo(sessionD)<0);
		assertTrue(sessionD.compareTo(sessionC)>0);
	}
	

}
