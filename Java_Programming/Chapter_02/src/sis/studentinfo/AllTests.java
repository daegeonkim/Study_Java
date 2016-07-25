package sis.studentinfo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CourseSessionTest.class);
		suite.addTestSuite(DateUtilTest.class);
		suite.addTestSuite(StudentTest.class);
		//$JUnit-END$
		return suite;
	}

}
