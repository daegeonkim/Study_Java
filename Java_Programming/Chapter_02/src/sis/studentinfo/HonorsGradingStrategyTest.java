package sis.studentinfo;

import junit.framework.TestCase;
import sis.report.ReportCard;
import static sis.studentinfo.Student.GRADE;

public class HonorsGradingStrategyTest extends TestCase{
	public void testGetGradetPoints(){
		HonorsGradingStrategy strategy = new HonorsGradingStrategy();
		assertEquals(5, strategy.getGradePointsFor(GRADE.A));
		assertEquals(4, strategy.getGradePointsFor(GRADE.B));
		assertEquals(3, strategy.getGradePointsFor(GRADE.C));
		assertEquals(2, strategy.getGradePointsFor(GRADE.D));
		assertEquals(0, strategy.getGradePointsFor(GRADE.F));
		
	}
}
