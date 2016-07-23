package Question.chess;

import Question.pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase{
	final String firstPawnColor = "White";
	final  String secondPawnColor = "Black";
	private Board board;
	
	
	public void setUp(){
		board = new Board();
	}
	
	
	public void testCreate(){
		Board board = new Board();
		assertEquals(3, board.getNumberofPawns()); //생성했을때 폰이 객체가 자동으로 생성되는지 확
		
		Pawn firstPawn = new Pawn(firstPawnColor);
		Pawn secondPawn = new Pawn("Black");
		assertEquals("Black", secondPawn.getColor());
		Pawn thirdPawn = new Pawn();
		
		/*board.enroll(firstPawn);
		assertEquals(4, board.getNumberofPawns());
		board.enroll(secondPawn);
		assertEquals(5, board.getNumberofPawns());
		board.enroll(thirdPawn);
		assertEquals(6, board.getNumberofPawns());
		new Integer("7");
		//board.enroll(Integer);*/
		board.initialize();
		
		
				
		
	}
}