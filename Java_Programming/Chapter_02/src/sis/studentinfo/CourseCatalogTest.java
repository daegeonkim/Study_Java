package sis.studentinfo;

import junit.framework.TestCase;
import java.util.*;
import java.io.*;



public class CourseCatalogTest extends TestCase{
	private CourseCatalog catalog;
	private Session session1;
	private Session session2;
	private Course course1;
	private Course course2;
	
	
	protected void setUp(){
		catalog = new CourseCatalog();
		course1 = new Course("a", "1");
		course2 = new Course("a", "1");
		
		session1 = CourseSession.create(course1, DateUtil.createDate(1, 15, 2005));
		session1.setNumberOfCredits(3);
		
		session2 = CourseSession.create(course2, DateUtil.createDate(1, 17, 2005));
		session2.setNumberOfCredits(5);
		//session2.enroll(new Student("A")); //학생이 추가되는 경우 직렬화가 안된다는데 왜 안되는 것일? 
		//session에 student 리스트에 transient 를 하면 직렬화되지않으며 통과횐다는데 그것은또 왜그런것일까.
		
		
		
		catalog.add(session1);
		catalog.add(session2);
	
	}
	
	public void testStoreAndLoad() throws Exception{
		final String filename = "CourseCatalogTest.testAdd.txt";
		catalog.store(filename);
		catalog.clearAll();
		assertEquals(0, catalog.getSessions().size());
		catalog.load(filename);
		
		List<Session> sessions = catalog.getSessions();
		assertEquals(2, sessions.size());
		assertSession(session1, sessions.get(0));
		assertSession(session2, sessions.get(1));
	}
	
	private void assertSession(Session expected, Session retrieved){
		assertNotSame(expected, retrieved);
		assertEquals(expected.getNumberOfCredits(), retrieved.getNumberOfCredits());
		assertEquals(expected.getStartDate(), retrieved.getStartDate());
		assertEquals(expected.getDepartment(), retrieved.getDepartment());
		assertEquals(expected.getNumber(), retrieved.getNumber());
	}
	

}
