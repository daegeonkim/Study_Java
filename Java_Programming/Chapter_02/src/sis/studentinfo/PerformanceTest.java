package sis.studentinfo;

import junit.framework.TestCase;

public class PerformanceTest extends TestCase{
	
	private static final double tolerance = 0.05;
	
	public void testAverage(){
		Performance performance =new Performance();
		performance.setNumberOfTests(4);
		performance.set(0, 98);
		performance.set(1,92);
		performance.set(2,81);
		performance.set(3,72);
		
		assertEquals(92, performance.get(1));
		
		assertEquals(85.73, performance.average(), tolerance);
		}
	
	public void testInitialization(){
		Performance performance = new Performance();
		performance.setScores(75, 72, 90, 60);
		assertEquals(74.25, performance.average(), tolerance);		
	}
	
	public void testAverageForNonScore(){
		Performance performance = new Performance();
		assertEquals(0.0, performance.average());
	}
}
