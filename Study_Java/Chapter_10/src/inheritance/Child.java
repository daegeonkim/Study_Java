package inheritance;

public class Child extends Parent{
	public Child(){
	//	System.out.println("Child constructor"); // 객체 생성시 실행되는 문구
		//super(null);
		//System.out.println("Child constructor");
	}
	public Child(String name){
		//super(name);
		//System.out.println("Child(String) Constructor"); // 이렇게만 적을경우 parent 에 매개변수없는 생성자가 없음으로 오류출
	}
	//public void printName(){
		//System.out.println("printName()-child");// overriding 되기때문에 자식클래스에있는 메소드만 실행된
//	}
	//private String printName(){ // 자식클래스에서 부모클래스와 다르게 리턴타입을 설정할수 없다
//		System.out.println("printName()-child");
	//	return "printName()-child";  // 부모클래스보다 작은 권한으로 선언해서도 안된다.  (확장되는것은 가능하
//	}
	public void printName(){ //권한이 확대도ㅓㅣ는것은 상관없
		System.out.println("printName()-child");
	}
	
	
	public void printAge(){
		System.out.println("printAge() *18 month");
	}
	
	public void test(){
		System.out.println("123");
	}
}
