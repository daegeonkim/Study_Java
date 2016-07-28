package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.*;


public class ReportCardTest extends TestCase{
	public void testMessage(){
		ReportCard card = new ReportCard();
		assertEquals(ReportCard.A_MESSAGE, card.getMessage(Student.GRADE.A));
		assertEquals(ReportCard.B_MESSAGE, card.getMessage(Student.GRADE.B));
		assertEquals(ReportCard.C_MESSAGE, card.getMessage(Student.GRADE.C));
		assertEquals(ReportCard.D_MESSAGE, card.getMessage(Student.GRADE.D));
		assertEquals(ReportCard.F_MESSAGE, card.getMessage(Student.GRADE.F));
	}
}
