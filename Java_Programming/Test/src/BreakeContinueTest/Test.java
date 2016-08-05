package BreakeContinueTest;

import junit.framework.TestCase;
import java.util.*;


public class Test extends TestCase{
	
	public void testLabeledBreak(){
		List<List<String>> table = new ArrayList<List<String>>(); // ???? 일반 문자열이랑 뭐가다른거지 ??
		
		List<String> row1 = new ArrayList<String>();
		row1.add("5");
		row1.add("2");
		
		List<String> row2 = new ArrayList<String>();
		row2.add("3");
		row2.add("8");
		
		
		table.add(row1);
		table.add(row2);
		
		assertTrue(found(table, "3"));
		assertFalse(found(table, "9"));
	}
	
	private boolean found(List<List<String>> table, String target){ // 문자열에서 원하는 타겟을 찾는건가 ??
		boolean found = false;
		search:
			for(List<String> row: table){
				for(String Value :row){
					if (Value.equals(target)) {
						found = true;
						break search;
					}
				}
			}
		return found;
	}	
		
	
	
	public void testTernaryOperator(){ // 삼중연산자   
		int a = 0;
		String message = 
				"Test"+(a == 0?"is 0":"higher Then 0");
		
	}
	
	
	
	
}
