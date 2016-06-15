
public class Calculator_I_Made {
	public static void main(String args[]){
		Calculator_I_Made me = new Calculator_I_Made(); // 생성자가 없다고 하는데 (); 얘가 생성자아닌가 ??
		// [Dec7] 넹 아닙니다..
		// [Dec7] new Calculator_I_Made()는 생성자를 부르는 문법입니다.
		// [Dec7] Calculator_I_Made()의 기본생성자는 생략된상태라 보이지 않습니다.
		System.out.println(me.add(1, 2));
	}
	// [Dec7] 아래엔 3개의 생성자가 정의되어 있음... 생성자와 메소드의 차이점을 구별해보도록
	public Calculator_I_Made() {
		// 아무 인자를 받지 않는 생성자는 기본생성자.
	}
	public Calculator_I_Made(String name) {
		System.out.println("name: " + name);
	}
	public Calculator_I_Made(String name, int age) {
		System.out.println("name: " + name + ",  age: " + age);
	}
	/*
		등등.. Input Type이 다른한. 계속 추가될 수 있음.
	*/
	public int add(int a, int b){
		return a+b;
	}
	public int subtract(int a, int b){
		return a-b;
	}
	public int multiply (int a, int b){
		return a*b;
	}
	public int divide(int a, int b){
		return a/b;
	}
}



// 깃 통해서 다른점 확인필


