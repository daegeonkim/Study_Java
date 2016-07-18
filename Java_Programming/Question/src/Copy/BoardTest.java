package Copy;

import pieces.Pawn;
import junit.framework.TestCase;;

public class BoardTest extends TestCase{
	final String firstPawnColor = "White";
	final  String secondPawnColor = "Black";
	private Board board2;
	
	public void setup(){
		board2 = new Board();
	}
	
	
	public void testCreate(){
	
		Pawn firstPawn = new Pawn(firstPawnColor);
		
		Pawn secondPawn = new Pawn(secondPawnColor);
		
		Pawn thirdPawn = new Pawn();
		
		board2.enroll(firstPawn);
				
		
	}
}
