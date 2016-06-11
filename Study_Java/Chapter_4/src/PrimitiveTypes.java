
public class PrimitiveTypes {
	public static void main(String[]args){
		PrimitiveTypes types = new PrimitiveTypes();
		types.defaultValues();
	}
	public void checkByte() {
		byte byteMin=-128;//int 형의 최소
		byte byteMax=127;// int 형의 최대값 
		System.out.println(byteMin);
		System.out.println(byteMax);
		byteMin--;//최소값 - 1
		byteMax++;//최대값 +1
		System.out.println("byteMin--="+byteMin);
		System.out.println("byteMax++="+byteMax);
	//최대값이기때문에 더하거나 빼도 최대값 최소값 출력
	}
	
	public void checkotherTypes(){
		short shortMax = 32767; //short 형의 최대
		int intMax = 2147483647;// int 의 최소
		long longMax = 9223372036854775807l;	//long 의 쵀대값 (int 범위 초과한경우 뒤에 l 을 붙혀줘야 long 타입으로 인식가능	
		System.out.println(shortMax);
		System.out.println(intMax);
		System.out.println(longMax);
	}
// byte = 8비트 ????

	public void checkChar(){ 
		char charMin ='\u0000'; //캐릭터 형 변수 선언 후 해당 값 불러옴 
		char charMax ='\uffff';
		
		System.out.println(charMin);
		System.out.println(charMax);	
		int intValue='a'; //ASCII(1byte) a 에 해당하는 값 출력
		System.out.println(intValue);//해당 값 출력
	}

	public void checkBoolean(){
		boolean flag =true;
		System.out.println(flag);;
		flag = false;
		System.out.println(flag);;
	}
	
	int intDefault1;
	public void defaultValues(){
		int intDefault2;
		System.out.println(intDefault1);
		System.out.println(intDefault2);
	
	}


}

