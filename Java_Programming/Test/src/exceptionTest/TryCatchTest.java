package exceptionTest;

import junit.framework.TestCase;

public class TryCatchTest extends TestCase{
	int c;
	public void testMethod(){
	try{
		c= 4/0;
		}
	catch(ArithmeticException adasd){
		c = -1;
		}
	}
	
	public void testReturn(){
		if (1<2){
			return;
		}
	}
	
}
