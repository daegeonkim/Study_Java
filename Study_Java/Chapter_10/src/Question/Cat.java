package Question;

public class Cat extends Animal {

	public void move(String name){
		this.name = name;
		System.out.println(name+" can move(Cat)");
	}
	
	
	public void eatFood(String name){
		this.name = name;
		System.out.println(name+" can eat food(Cat)");
	}
 
	
	
}
