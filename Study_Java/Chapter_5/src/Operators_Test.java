
public class Operators_Test {
	int intValue1 = 10;
	public static void main (String[]args){
		Operators_Test Test = new Operators_Test();
		Test.compound();
		

	}		
	public void compound(){
		intValue1 = intValue1 + 5;
		System.out.println(intValue1);
		intValue1 = intValue1 -5;
		System.out.println(intValue1);
		intValue1 = intValue1*5;
		System.out.println(intValue1);
		intValue1 = intValue1 /5;
		System.out.println(intValue1);
		intValue1 = intValue1 & 5 ;
		System.out.println(intValue1);
	}
	public void flagcheck(){
		int flag1 = 1;
		int flag2 = 2;
		System.out.println(flag1 == flag2);
		System.out.println(flag1 != flag2);
		
	}
}
