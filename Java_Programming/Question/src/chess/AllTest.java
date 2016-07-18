package chess;

public class AllTest {
	public static junit.framework.TestSuite suite(){ //일종의 오버라이딩 인듯 하다 
		junit.framework.TestSuite suite = new junit.framework.TestSuite();
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(PawnTest.class);
		return suite;
	}

}
