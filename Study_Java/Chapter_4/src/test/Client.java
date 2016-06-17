package test;


public class Client {
	
	// class 변수
	static int staticNum = 100;
	
	// instance 변수
	int num = 100;
	
	public static void main(String[] args) {
		
//		Client c = new Client();
		
//		CloneQuestion cq = new CloneQuestion();
		//Client client = new Client();
		
//		System.out.println(num);
		
		System.out.println(Person.staticName);
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person1.setName("dec1");
		person2.setName("dec2");
		person3.setName("dec3");
//		System.out.println(person1.say());
//		System.out.println(person2.say());
//		System.out.println(person3.say());
		
		String name = person1.print();  // name 
		System.out.println("name: " + name);
		
		//void void
	/*
	 * input output
	 * void 	void
	 * value	void
	 * void 	value
	 * value	value
	 * 
	 * 

	 */
		
		
		
		
		
	
		
	}
	
	
	

}
