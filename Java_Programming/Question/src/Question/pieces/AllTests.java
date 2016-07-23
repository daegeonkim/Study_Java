package Question.pieces;

import junit.framework.TestSuite;

public class AllTests {

	public static junit.framework.TestSuite suite() {
		TestSuite suite = new TestSuite();
		//$JUnit-BEGIN$
		suite.addTestSuite(PawnTest.class);
		//$JUnit-END$
		return suite;
	}

}
