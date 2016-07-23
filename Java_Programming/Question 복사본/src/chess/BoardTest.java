package chess;

import pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase{
	final String firstPawnColor = "White";
	final  String secondPawnColor = "Black";
	private Board board;
	
	
	public void setUp(){
		board = new Board();
	}
	
	
	public void testCreate(){
		Board board2 = new Board();
		Pawn firstPawn = new Pawn(firstPawnColor);
		Pawn secondPawn = new Pawn(secondPawnColor);
		Pawn thirdPawn = new Pawn();
		
		board.enroll(firstPawn);
		assertEquals(1, board.getNumberofPawns());
		board.enroll(secondPawn);
		assertEquals(2, board.getNumberofPawns());
		board.enroll(thirdPawn);
		assertEquals(3, board.getNumberofPawns());
		new Integer("7");
		//board.enroll(Integer);
		
				
		
	}
}