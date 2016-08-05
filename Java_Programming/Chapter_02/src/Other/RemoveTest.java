package Other;

import java.util.*;

import junit.framework.TestCase;

public class RemoveTest extends TestCase{
	List<String> testList = new ArrayList<String>();
	
	public void testMethod(){
		testList.add("1");
		testList.add("2");
		testList.add("3");
		
		System.out.println(returnTest());
	}
	
	public String returnTest(){
		return testList.remove(testList.size() -1);
	}
	

}
