public class Calculator {
	
	// [Dec7] int는 반환타입을 정의함. 즉 int 자료형만 반환할 수 있다는 의미
	public int/**이것은 무엇인가 왜 갑자기 나온것인..*/ add(int num1, int num2) {
		int sum;// int 자료형 변수 선..
		sum = num1 + num2; // int 자료형 sum 은 등호 이후와 같다고 정
		// [Dec7] 노.. int 타입 sum변수는 int(4byte정수) 만 저장 가능하고, num1변수와 num2 변수 저장한 결과를 sum에 저장한다는 의미
		return sum;  // [Dec7] 그리고 저장결과 sum을 반환.. 즉.. sum의 타입과 반환타입이 같음
	}

	// [Dec7] addAll은 메소드의 이름.. 프로그래머가 정하는 이름이고, 해당 메소드가 어떤 연산을 할지에 대한 간단한 내용이라고 봐도 됨
	public int addAll/** 애드 올은 또무엇인거뭐가 다른것인가...*/(int num1, int num2, int num3) {
		int sum=0;// 변수 를 0 으로 초기화한
		// Insert code here. << 뭘적으란거임 ?
		// [Dec7] ex.
		sum = num1 + num2 + num3;  // [Dec7] OK 
		return sum;
	}
	
	public int subtract(int num1, int num2) {
		int result=num1 - num2;
		return result;
	}
	public int multiply(int num1, int num2) {
		int result=num1 * num2;
		return result;
	}
	public int divide(int num1, int num2) {
		int result=num1 / num2;
		return result;
	}

}
