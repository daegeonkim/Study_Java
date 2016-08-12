package sis.util;

import javax.swing.plaf.synth.SynthSpinnerUI;

import junit.framework.*;

public class PasswordGeneratorTest extends TestCase
{
	public void testGeneratePassword(){
	
		PasswordGenerator generator = new PasswordGenerator(); 
		generator.setRandom(new MockRandom("A"));
		assertEquals("ABCDEFGH", generator.generatePassword());

		generator.setRandom(new MockRandom("C"));
		assertEquals("CDEFGHIJ", generator.generatePassword());

		//generator.setRandom(new MockRandom('1')); // 예외 발생확인 테스트
	}


	class MockRandom extends java.util.Random{
		private int i;
		
		public MockRandom(String startCharValue) { // 
			char a = startCharValue.charAt(0);
			i = a - PasswordGenerator.LOW_END_PASSWORD_CHAR; 
		}
		@Override
		protected int next(int bits){
			return i++;
		}
	}
}


/*PassWordGenerateTest 에서 스트링 타입 외에 다른 내용이오면 예외발생시키고 싶은데 어떻하지

ㄴ mock 의 생성자의 매개변수를  String타입으로 변경하고

생성시 String 을 char 으로 변환시키도록 만듬

이후 테스트 시 모두 패스됨.*/




