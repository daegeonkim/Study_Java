package sis;
import junit.framework.TestSuite;
import junit.framework.Test;

public class AllTest {
	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(sis.report.AllTest.suite());
		suite.addTest(sis.studentinfo.AllTest.suite());
		return suite;
		
	}
	
	

}
