package supertest;

import java.util.*;
import junit.framework.TestCase;

public class setTest extends TestCase {
	
	public void testSet(){
		Set set = new HashSet();

		set.add("A");
		set.add("B");
		set.add("D");
		set.add("C");
		set.add("E");
		set.add("A");
		set.add("F");
		
		
		System.out.println(set);
		
		System.out.println("--------------------------");
		
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
		sortedSet.add("ABC");
		System.out.println("-------------");
		System.out.println(sortedSet);		
	}
}
