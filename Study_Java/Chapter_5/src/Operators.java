
public class Operators {
	int intValue1 = 5;
	int intValue2= 10;
	int result;
	
	public static void main(String args[]){
		Operators sample = new Operators();
		sample.complement();
		
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

}

