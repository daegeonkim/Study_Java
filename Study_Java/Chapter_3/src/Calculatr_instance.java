
public class Calculatr_instance {
	public static void main(String args[]){
		Calculator_I_Made me = new Calculator_I_Made();
		int num1 = 3;
		int num2 = 4;
			
		System.out.println(me.add(num1, num2));
	}
}
//  1차 시도 : The method add(int) in the type Calculator_I_Made is not applicable for the arguments  지원않는다고


// num1변수고 이변수에 1을 지정한다 이런의미로 사용되는게아님 따로  변수에숫자를 설정해줘야함