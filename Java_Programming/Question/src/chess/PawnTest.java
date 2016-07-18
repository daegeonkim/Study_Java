package chess;

import pieces.Pawn;
import junit.framework.TestCase;;

public class PawnTest extends TestCase {
	
	public void testCreate(){
		final String firstPawnColor = "White";
		final String secondPawnColor = "Black";
		Pawn pawn =new Pawn(firstPawnColor);
		Pawn pawn2 = new Pawn(secondPawnColor);
		assertEquals("White", pawn.getColor());
		assertEquals("Black", pawn2.getColor());	
		
		
		Pawn cleanPawn = new Pawn(); //색없이 말을 생성하는 테스트를추가하고 에러를 없앤다. // 기본생성자 추가로 해		
	}
}