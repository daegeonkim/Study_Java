package Other;

import junit.framework.TestCase;

public class IfinityTest extends TestCase{
	final float tolerance = 0.5f;
	final float x = 1f;
	
	public void testInfinity(){
		// postive , negative infinity 의 차이는 음수 무한의 수와 양수의 무한의 수다.
		
		assertEquals(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY*100, tolerance);
		assertEquals(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY*-1, tolerance);
		
		assertEquals(Float.POSITIVE_INFINITY,  x / 0f, tolerance);
		assertEquals(Float.NEGATIVE_INFINITY,  x / -0f, tolerance);
		assertTrue(Float.isNaN(x%0f)); // ???
		
		assertEquals(0f, x/Float.POSITIVE_INFINITY, tolerance);
		assertEquals(-0f, x/Float.NEGATIVE_INFINITY, tolerance);
		assertEquals(x,  x%Float.POSITIVE_INFINITY,tolerance);
	
		assertTrue(Float.isNaN(0f /0f));
		assertTrue(Float.isNaN(0f % 0f));
		
		assertEquals(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY / x, tolerance);
		assertEquals(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY / x, tolerance);
		assertTrue(Float.isNaN(Float.POSITIVE_INFINITY % x));
		
		
		//수치 오버플로
		
		byte b = Byte.MAX_VALUE;
		assertEquals(Byte.MAX_VALUE+1, b+1);
		System.out.println(Byte.MAX_VALUE);
	
	}

}
