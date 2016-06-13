
public class Operators {
	int intValue1 = 5;
	int intValue2= 10;
	int result;
	
	public static void main(String args[]){
		Operators sample = new Operators();
		sample.casting2();
		
	}
	public void additive (){
		result =intValue1 + intValue2;
		System.out.println(result);
		result = intValue2-intValue1;
		System.out.println(result);	
	}
	public void only (){
		result = intValue1*intValue2;
		System.out.println(result);
		result = intValue1/intValue2; // 0.5 지만 정수형으로 선언했기때문에 0으로 출력됨.
		System.out.println(result);
		result = intValue2/intValue1;
		System.out.println(result);
	}
	public void remainder (){
		int intValue1 = 53;
		int intValue2 = 10;
		result = intValue1%intValue2; // 나누기 하고 남은 나머지값을 구
		System.out.println(result);
	}

	public void unary(){
		int intValue = -10;
		int intresult = +intValue; // +,- 로 만들어
		System.out.println(intresult);
		intresult = -intValue;
		System.out.println(intresult);		
	}
	public void increDecre(){
		int aa = 1;
		System.out.println(aa++); // 출력 후 1을더함 그래서 출력값은 그대로 1
		System.out.println(aa); //1이 더해졌기때문에  a값은 윗줄에서 2로 변경
		System.out.println(++aa); // 1을 더한 후 출
		System.out.println(aa); //그러므로 3 
	}
	public void complement(){
		boolean flag = true;
		System.out.println(flag); //!은boolean 값을 반대로 
		System.out.println(!flag); //값반대로 후 출
	}
	public void flagcheck(){
		int flag1 = 1;
		int flag2 = 2;
		System.out.println(flag1 == flag2); // 같지않는데 같음 연산연결했기때문 false출
		System.out.println(flag1 != flag2);// 같지않은게 참임으로  True출력 
		System.out.println("-------------");
		
		char charValue='a';
		System.out.println(charValue == 97); // 정수형 Char 'a' 값과 97 값이 같음으로 True 출
		double doubleValue = 1.0; 
		System.out.println(doubleValue == flag1); // 소수형(double) 1.0과  정수형(int) 1 의 값이 같음으로 True
	}
	public void aa(){
		boolean aa = true;
		boolean bb = false;
		System.out.println(aa == bb); // 실험해보라했는데 같지않음으로 False 출력 
	}
	public boolean doBlindDate(int point){ // int point ??
		boolean doBlindDateFalg =false;
		doBlindDateFalg = (point >= 80) ? true : false;
		return doBlindDateFalg;
	}
	public void casting(){
		byte byteValue = 127;
		byte byteValue1 = 127;
		short shortValue=byteValue ;
		shortValue++;
		System.out.println(shortValue);
		byteValue =(byte)shortValue;
		System.out.println(byteValue);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(byteValue1++);
		}
	public void casting2(){
		byte byte1=127;
		short short1 = 256;
		short1 = (byte)short1;
		System.out.println(short1); // 8바이트로 연산시, 1 바이트가 처리할수있는 영역 밖에있어 000000 ㅇ0으로 출력
	}
	
	
}


