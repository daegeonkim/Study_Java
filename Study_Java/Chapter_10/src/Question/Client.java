package Question;

public class Client {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.move("dog");
		dog.eatFood("dog");
		cat.move("cat");
		cat.eatFood("cat");
	}
	// 어떻게 리펙토링해야할지는 아직 모르겠다.
	// 매개변수를 객체이름으로 하는걸 본거같은데 어떻게하더라 ...
	
	
	

}
