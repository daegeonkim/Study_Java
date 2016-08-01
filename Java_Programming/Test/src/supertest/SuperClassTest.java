package supertest;

import junit.framework.TestCase;

public class SuperClassTest extends TestCase{
	public void testConstructorCalls(){
		SuperClass superClass = new SubClass("parm");
		
		assertTrue(SuperClass.constructorWasCalled);
	}

}
