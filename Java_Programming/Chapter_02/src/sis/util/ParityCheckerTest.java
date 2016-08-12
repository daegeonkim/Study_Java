package sis.util;

import java.util.*;

import junit.framework.*;

public class ParityCheckerTest extends TestCase{
	public void testSingleByte(){
		ParityChecker checker = new ParityChecker();
		byte source1 = 10; // 1010
		byte source2 = 13; // 1101
		byte source3 = 2;  // 0010
		
		byte [] data = new byte [] {source1, source2, source3};
		
		byte checksum = 5; //0101;
		
		assertEquals(checksum, checker.checksum(data));
		//System.out.println(checker.checksum(data));
		//corrupt the source2 element
		
		data[1] = 14; //1110
		
		assertFalse(checksum == checker.checksum(data));

		
		                        //101=5							
		assertEquals(10, 5<<1); //1010 = 10
		assertEquals(20, 5<<2);// 10100 = 20
		assertEquals(40, 5<<3);// 101000 = 40
		assertEquals(20, 40>>1);
		assertEquals(10, 40>>2);
	}
	
	public void testCoinFlips(){ // 랜덤객체 생성과 같은시드로 랜덤객체 생성시 생성되는 값들이 같다는 증명테스트. 
		final long seed = 100L;
		final int total = 10;
		Random random1 = new Random(seed);
		List<Boolean> flips1 = new ArrayList<Boolean>();
		
		for(int i=0 ; i<total; i++){
			flips1.add(random1.nextBoolean());
		}
		
		Random random2 = new Random(seed);
		List<Boolean> flips2 = new ArrayList<Boolean>();
		
		for(int i=0 ; i<total; i++){
			flips2.add(random2.nextBoolean());
		}


	assertEquals(flips1, flips2);
	}


}
