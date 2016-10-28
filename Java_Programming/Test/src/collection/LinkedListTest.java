package collection;

import java.util.*;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase{
	
	public void test1(){
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		
		assertEquals(0, list1.indexOf("a"));
		assertEquals("a", list1.get(0));
		 
		
	}
	
	
}
