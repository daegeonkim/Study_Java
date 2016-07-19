package Other;
import junit.framework.TestCase;


public class WordTest extends TestCase{
	char capitalA = 'A';
	
	public void testMethod(){
		assertEquals('\u0041', capitalA);// 16 진수 유니코드 형 
		assertEquals('\101', capitalA);// 8 진수 이스케이프 형 
		assertEquals('\101', '\u0041');// 둘은 같음  
		String z= "a\tb\nc\r1";
		System.out.println(z);
	}
	
	

	
	
}
