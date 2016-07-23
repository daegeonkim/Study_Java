package pieces;

import junit.framework.TestCase;


public class PawnTest extends TestCase {
	
	public void testCreate(){
		final String firstPawnColor = "White";
		Pawn pawn =new Pawn();
		assertEquals("White", pawn.getColor());
		
		final String secondPawnColor = "Black";
		Pawn pawn2 = new Pawn(secondPawnColor);
		assertEquals("Black", pawn2.getColor());	
		

	}
}