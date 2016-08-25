package sis.studentinfo;

import junit.framework.*;
import java.io.*;

public class StudentDirectoryTest extends TestCase{
	private StudentDirectory dir;
	
	
	
	protected void setUp() throws IOException{
		dir = new StudentDirectory();
	}
	
	protected void tearDown()throws IOException{
		dir.close();
		dir.remove();
	}
	
	

	
	public void testStoreAndRetrieve() throws IOException{
		final int numberOfStudent = 10;
		for(int i=0; i<numberOfStudent; i++){
			addStudent(dir, i);
		}
		dir.close();
		
		dir = new StudentDirectory();
		for(int i=0; i<numberOfStudent; i++){
			verifyStudentLookup(dir, i);
		}
	}
	
	void addStudent(StudentDirectory directory, int i) throws IOException{
		String id = ""+i;
		Student student = new Student(id);
		student.setId(id);
		student.addCredits(i);
		directory.add(student);		
	}
	
	void verifyStudentLookup(StudentDirectory directory, int i) throws IOException{
		String id = ""+i;
		Student student = dir.findById(id);
		assertEquals(id, student.getLastName());
		assertEquals(id, student.getId());
		assertEquals(id, student.getCredits());
	}
	
	
}
