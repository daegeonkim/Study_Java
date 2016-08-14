package chess;


import junit.framework.TestCase;


public class PawnTest extends TestCase {

	public void testCreate(){
		Piece blackPawn = Piece.createPawn(Piece.WHITE, "P");
		Piece whitePawn = Piece.createPawn(Piece.BLACK, "p");
		assertEquals("P", blackPawn.getType());
		assertEquals("p", whitePawn.getType());
	}
	
	public void testGetColor(){
		Piece pawn1 = Piece.createPawn(Piece.WHITE, "P");
		assertEquals(Piece.WHITE, pawn1.getColor());
	
		Piece pawn2 = Piece.createPawn(Piece.BLACK, "p");
		assertEquals(Piece.BLACK, pawn2.getColor());
	}	

	public void testIsColor(){
		Piece whitePawn = Piece.createPawn(Piece.WHITE, "P");
		Piece blackPawn = Piece.createPawn(Piece.BLACK, "p");
		
		assertTrue(whitePawn.isWhite());
		assertTrue(blackPawn.isBlack());
	}
}
