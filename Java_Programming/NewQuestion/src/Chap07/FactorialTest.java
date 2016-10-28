package Chap07;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import junit.framework.TestCase;

public class FactorialTest extends TestCase{
	Factorial factorial = new Factorial();
	
	
//	public void testFactorial(){
//		assertEquals(1, factorial.whileFactorial(0));
//		assertEquals(1, factorial.whileFactorial(1));
//		assertEquals(2, factorial.whileFactorial(2));
//		assertEquals(6, factorial.whileFactorial(3));
//		assertEquals(24, factorial.whileFactorial(4));
//		assertEquals(120, factorial.whileFactorial(5));
//	}
//	
//	public void testForFactorial (){
//		assertEquals(1, factorial.forFactorial(0));
//		assertEquals(1, factorial.forFactorial(1));
//		assertEquals(2, factorial.forFactorial(2));
//		assertEquals(6, factorial.forFactorial(3));
//		assertEquals(24, factorial.forFactorial(4));
//		assertEquals(120, factorial.forFactorial(5));
//		}
//
//	public void testDoWhileFactorial(){
//		assertEquals(1, factorial.doWhileFactorial(0));
//		assertEquals(1, factorial.doWhileFactorial(1));
//		assertEquals(2, factorial.doWhileFactorial(2));
//		assertEquals(6, factorial.doWhileFactorial(3));
//		assertEquals(24, factorial.doWhileFactorial(4));
//		assertEquals(120, factorial.doWhileFactorial(5));
//	}
//	
//	public void test4(){
//		System.out.println(factorial.stringNum(4));
//	}
	
	public void testTokenizer(){
		String line = factorial.test2(12);
		Vector<String> results = factorial.split(line);
		
		System.out.println(results);
		
		
	}
}
