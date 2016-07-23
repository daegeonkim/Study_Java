package Question;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(Question.chess.AllTests.suite());
		suite.addTest(Question.pieces.AllTests.suite());
		
		//$JUnit-END$
		return suite;
	}

}
