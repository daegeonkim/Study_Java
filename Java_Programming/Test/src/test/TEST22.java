package test;


public class TEST22 implements Comparable<TEST22>{
	static int count;
	private String first;
	private String second;
	private String third;
	
	
	public TEST22(String first, String secondm, String third){
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public TEST22(String first, String third){
		this(first, "", third);
	}
	
	static int getCount(){
		return count;
	}
	public static void methodTest(){
		System.out.println("Sucsesss");
	}
	public String getTest(){
		return first;
		
	}

}
