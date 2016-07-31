package sis.studentinfo;

import static sis.studentinfo.Student.GRADE;

import junit.framework.TestCase;

public class BasicGradingStrategyTest extends TestCase{
	public void testGetGradetPoints(){
		BasicGradingStrategy strategy = new BasicGradingStrategy();
 		assertEquals(4, strategy.getGradePointsFor(GRADE.A));
		assertEquals(3, strategy.getGradePointsFor(GRADE.B));
		assertEquals(2, strategy.getGradePointsFor(GRADE.C));
		assertEquals(1, strategy.getGradePointsFor(GRADE.D));
		assertEquals(0, strategy.getGradePointsFor(GRADE.F));
		
	}

}
