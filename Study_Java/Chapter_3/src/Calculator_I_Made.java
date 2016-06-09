
public class Calculator_I_Made {
	public static void main(String args[]){
		Calculator_I_Made me = new Calculator_I_Made(); // 생성자가 없다고 하는데 (); 얘가 생성자아닌가 ??
		System.out.println(me.add(1, 2));
	}
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


