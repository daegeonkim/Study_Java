package Question;

public class Dog extends Animal {
	
	public void move(String name){
		this.name = name;
		System.out.println(name+" can move(dog)");
	}
	
	
	public void eatFood(String name){
		this.name = name;
		System.out.println(name+" can eat food(dog)");
	}

}
