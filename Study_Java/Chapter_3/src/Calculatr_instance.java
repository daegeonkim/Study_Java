
public class Calculatr_instance {
	public static void main(String args[]){
		Calculator_I_Made me = new Calculator_I_Made(); // 생성자가 없다고 하는데 (); 얘가 생성자아닌가 ??
			
		System.out.println(me.add(1, 2));
	}
}
//  1차 시도 : The method add(int) in the type Calculator_I_Made is not applicable for the arguments  지원않는다고


// num1변수고 이변수에 1을 지정한다 이런의미로 사용되는게아님 따로  변수에숫자를 설정해줘야함


// 3차시도 계산기_내가만듬 코드를 책에있는대로 바꿔적음 