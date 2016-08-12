package Other;

import java.math.*;

import junit.framework.*;

public class XorTest extends TestCase{
	public void testParity(){
		assertEquals(0, xorAll(0, 1, 0, 1));
		assertEquals(1, xorAll(0, 1, 1, 1));
		
	}
	
	private int xorAll(int first, int ... rest){
		int parity = first;
		for(int num: rest){
			parity ^= num;
		}
		return parity;
	}
	
}
