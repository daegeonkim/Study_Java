package chess;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(CharacterTest.class);
		//$JUnit-END$
		return suite;
	}

}
