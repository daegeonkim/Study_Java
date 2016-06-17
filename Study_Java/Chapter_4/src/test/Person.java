package test;

public class Person {
	
	public static String staticName = "STATIC"; 
	// private () protected public
	private String name;

	public void setName(String name) {
		
		this.name = name;
		// TODO Auto-generated method stub
	
	}

	public String say() {
		
		return "i'm " + name;
	}

	public String print() {
		// TODO Auto-generated method stub	
		
		return name;
	}

}
