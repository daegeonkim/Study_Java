package sis.studentinfo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTest {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTest.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CourseSessionTest.class);
		suite.addTestSuite(DateUtilTest.class);
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(HonorsGradingStrategyTest.class);
		suite.addTestSuite(BasicGradingStrategyTest.class);
	
		//$JUnit-END$
		return suite;
		
	}

}
