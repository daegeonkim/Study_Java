package splitTest;

public class Any {
	public static String a;
	public String b;
	
	
	public Any(String a){
		this.a = a;		
	}
	
	public static void test(){
		a = "This is Static Method";
		
	}
	
	public void test1 (){
		a = "This is non-Static Method";
		b = "this is non static field";
	}
	
	public enum test{
		APPLE("RED"), PEACH("PINK");
		public String color;
		test(String color){
			
		}
	}
	
	public void aa(){
		if(1==1){
			switch (key) {
			case value:
				
				break;

			default:
				break;
			}
		}
	}
		
}
