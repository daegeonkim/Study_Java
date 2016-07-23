package sis;
import junit.framework.TestSuite;

public class AllTest {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(sis.report.AllTest.suite());
		suite.addTest(sis.studentinfo.AllTest.suite());
		return suite;
		
	}
	
	

}
