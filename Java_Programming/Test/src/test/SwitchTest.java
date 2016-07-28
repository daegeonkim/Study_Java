package test;

import junit.framework.TestCase;

public class SwitchTest extends TestCase{
	enum Score {a,b,c,d}
	int total;
	Score score =Score.a;
	
	public void testSwitch(){
		
		switch (Score.a) {
		case a:
			total += 3;
			
		case b:
		case c:
			total += 5;
			
		}
		System.out.println(total);
	
	}
	
}
