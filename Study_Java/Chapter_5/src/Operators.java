
public class Operators {
	public static void main(String args[]){
		Operators sample = new Operators();
		sample.only();
		
	}
	public void additive (){
		int intValue1 = 5;
		int intValue2= 10;
		int result =intValue1 + intValue2;
		System.out.println(result);
		result = intValue2-intValue1;
		System.out.println(result);	
	}
	public void only (){
		int intValue1 = 5;
		int intValue2= 10;
		
		int result = intValue1*intValue2;
		System.out.println(result);
		result = intValue1/intValue2; // 0.5 지만 정수형으로 선언했기때문에 0으로 출력됨.
		System.out.println(result);
		result = intValue2/intValue1;
		System.out.println(result);
	}
}

