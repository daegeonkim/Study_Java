package Question.chess;
import junit.framework.TestCase;


public class CharacterTest extends TestCase {
	
	public void testWhitespace(){
		assertEquals(Character.isWhitespace('\n'), true); // isWhitespcae ()//Characer 클래스 안에 메소
		assertEquals(Character.isWhitespace('\t'), true); //  공백인지확인한다.
		assertEquals(Character.isWhitespace(' '), true);
		assertEquals(Character.isUnicodeIdentifierPart('^'), false);
		
	}

}
