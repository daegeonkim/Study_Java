package test;

//import junit.framework.TestCase;
public class TEST11{// extends TestCase {
	public static void main(String[] args) {
		TEST11 aa = new TEST11();
		aa.testCreate();
	}
	public void testCreate(){
		createObjecct();
		test();
	}
	
	public TEST22 createObjecct(){
		System.out.println("11");
		return new TEST22();
	}
	
	public void test(){
		System.out.println("22");
	}
	
	public void testMethod2(){
		TEST22.methodTest();
	}
}
