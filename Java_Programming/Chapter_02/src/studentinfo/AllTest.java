package studentinfo;

public class AllTest {
	public static junit.framework.TestSuite suite(){ //일종의 오버라이딩 인듯 하다 
		junit.framework.TestSuite suite = new junit.framework.TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		suite.addTestSuite(RosterReportTest.class);
		suite.addTestSuite(DateUtilTest.class);
		return suite;
	}

}
