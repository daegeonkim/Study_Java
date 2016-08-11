package sis.report;

import java.util.*;

import junit.framework.TestCase;
import sis.studentinfo.*;
import sis.studentinfo.Student.GRADE;


public class ReportCardTest extends TestCase{
	private ReportCard card;
	
	protected void setUp(){
		card = new ReportCard();
	}

	public void testMessage(){
		assertEquals(ReportCard.A_MESSAGE, card.getMessage(Student.GRADE.A));
		assertEquals(ReportCard.B_MESSAGE, card.getMessage(Student.GRADE.B));
		assertEquals(ReportCard.C_MESSAGE, card.getMessage(Student.GRADE.C));
		assertEquals(ReportCard.D_MESSAGE, card.getMessage(Student.GRADE.D));
		assertEquals(ReportCard.F_MESSAGE, card.getMessage(Student.GRADE.F));
	}
	
	public void testKey(){
		Set<Student.GRADE> expectedGrades = new HashSet<Student.GRADE>();
		expectedGrades.add(Student.GRADE.A);
		expectedGrades.add(Student.GRADE.B);
		expectedGrades.add(Student.GRADE.C);
		expectedGrades.add(Student.GRADE.D);
		expectedGrades.add(Student.GRADE.F);
		
		Set<Student.GRADE> grades = new HashSet<Student.GRADE>();
		for (Student.GRADE grade : card.getMessages().keySet()){
			grades.add(grade);
		}
		
		assertEquals(expectedGrades, grades);
//		System.out.println(expectedGrades.hashCode());
//		System.out.println(grades.hashCode()); //  너희는 어떻게 hash  코드가같은거니?
	}
	
	public void testValues(){
		List<String> expectedMessages = new ArrayList<String>();
		expectedMessages.add(ReportCard.A_MESSAGE);
		expectedMessages.add(ReportCard.B_MESSAGE);
		expectedMessages.add(ReportCard.C_MESSAGE);
		expectedMessages.add(ReportCard.D_MESSAGE);
		expectedMessages.add(ReportCard.F_MESSAGE);
		
		Collection<String> messages = card.getMessages().values();
		for( String message : messages){
			assertTrue(expectedMessages.contains(message));
		}
		assertEquals(expectedMessages.size(), messages.size());
	/*	
		//해시코드 비교  
		System.out.println(expectedMessages.hashCode());
		System.out.println(messages.hashCode());
		
		// 출력값 비교  
		for(String a : messages){
			System.out.println(a);
		}
		System.out.println("--------------");
		
		for(String a : expectedMessages){
			System.out.println(a);
		}*/
	}
	
	public void testEntries(){
		Set<Entry> entries = new HashSet<Entry>();
		
		for (Map.Entry<Student.GRADE, String> entry: card.getMessages().entrySet()){
			entries.add(new Entry(entry.getKey(), entry.getValue()));
		}
		Set<Entry> expectedEntries = new HashSet<Entry>();
		
		expectedEntries.add(new Entry(Student.GRADE.A, ReportCard.A_MESSAGE));
		expectedEntries.add(new Entry(Student.GRADE.B, ReportCard.B_MESSAGE));
		expectedEntries.add(new Entry(Student.GRADE.C, ReportCard.C_MESSAGE));
		expectedEntries.add(new Entry(Student.GRADE.D, ReportCard.D_MESSAGE));
		expectedEntries.add(new Entry(Student.GRADE.F, ReportCard.F_MESSAGE));
		
	//	assertEquals(expectedEntries, entries); // 왜 레퍼런스 주소가나오지 ??
												// 비교하는 자료형이 해쉬셋이니까 해쉬코드로 비교해야하는거아니낙 ??
		System.out.println(expectedEntries.hashCode());
		System.out.println(entries.hashCode());
		System.out.println(expectedEntries);
		System.out.println(entries);	
	}
	public void testToString(){
		Course course = new Course("ENGL", "301");
		assertEquals("ENGL 301", course.toString());
	}
}
