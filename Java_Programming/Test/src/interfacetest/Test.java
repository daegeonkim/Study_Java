package interfacetest;





public class Test{
	private ObjectTest testObject = new Test1();	
	
	public void setTest(ObjectTest testObject) {
		this.testObject = testObject;
	}
	
	public void testPrint(){
		System.out.println(testObject.testMethod());
	}
	
}
 