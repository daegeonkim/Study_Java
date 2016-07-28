package interfacetest;




public class TestCase extends junit.framework.TestCase{
	
	public void test1(){
		Test testOb = new Test();
		testOb.setTest(new Test2());
		testOb.testPrint();
		
	}
}
