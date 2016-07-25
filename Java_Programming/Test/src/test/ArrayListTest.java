package test;
import java.util.*;
import junit.framework.*;


public class ArrayListTest extends TestCase{
	public void testSortStringInPlace(){
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> sortedlist = new ArrayList<>();
		list.add("Z");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");
		list.add("F");
		list.add("E");
		java.util.Collections.sort(list);
		assertEquals("A", list.get(0));
		assertEquals("B", list.get(1));
		assertEquals("C", list.get(2));
		assertEquals("D", list.get(3));
		assertEquals("E", list.get(4));
		assertEquals("F", list.get(5));
		assertEquals("Z", list.get(6));	
	}
	
	public void addObject(ArrayTest2 object){
		ArrayList<ArrayTest2> testlist = new ArrayList<>();
		testlist.add(object);
	}
	
	public void sortTest(){
		ArrayTest2 test1 = new ArrayTest2("B");
		ArrayTest2 test2 = new ArrayTest2("C");
		ArrayTest2 test3 = new ArrayTest2("D");
		ArrayTest2 test4 = new ArrayTest2("E");
		for(int a=0;a<5;a++){
			
			
		}
	}
	
	
}
