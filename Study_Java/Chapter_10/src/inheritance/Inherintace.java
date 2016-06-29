package inheritance;

public class Inherintace {
	public static void main(String[] args) {
		Child child = new Child();
		child.printName();
		// 상속될경우, 부모클래스에서 기본생성자가 호출되고, 자식클래스의 생성자가 호출된다.
		// 이후실행하는 메소드가 실행된다.
		
	}
}
