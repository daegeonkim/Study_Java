package supertest;

public class SuperClass {
	static boolean constructorWasCalled = false;
	
	SuperClass(String parm){
		constructorWasCalled = true;	
	}
/*	SuperClass(){
		constructorWasCalled = true;
	}*/
	
}
