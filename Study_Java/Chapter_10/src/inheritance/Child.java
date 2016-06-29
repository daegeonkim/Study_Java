package inheritance;

public class Child extends Parent{
	public Child(){
	//	System.out.println("Child constructor"); // 객체 생성시 실행되는 문구
		super(null);
		System.out.println("Child constructor");
	}
	public Child(String name){
		super(name);
		System.out.println("Child(String) Constructor"); // 이렇게만 적을경우 parent 에 매개변수없는 생성자가 없음으로 오류출
	}
}
