package sis.report;
import junit.framework.TestSuite;;
public class AllTest {
	public static TestSuite suite (){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(RosterReportTest.class);
		suite.addTestSuite(ReportCardTest.class);
		return suite;
	}

}
