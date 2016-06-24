package Chapter_7;

public class StaticBlock {
	
	static int data =1 ;
	public StaticBlock() { // 얘는 메소드 ??
		System.out.println("static constructor.");
	}

	static {
		System.out.println("***First static block.***");
		data =3;
	}
	
	static{
		System.out.println("***Second static block.***");
		data =5;
	}
	
	public static int getData(){
		return data;
	}
	
}
