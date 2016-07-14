
public class PawnTest extends  junit.framework.TestCase {
	
	public void testCreate(){
		final String firstPawnColor = "White";
		final String secondPawnColor = "Black";
		Pawn pawn =new Pawn(firstPawnColor);
		Pawn pawn2 = new Pawn(secondPawnColor);
		assertEquals("White", pawn.getColor());
		assertEquals("Black", pawn2.getColor());
		
	}
}