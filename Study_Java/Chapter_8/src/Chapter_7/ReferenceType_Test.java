package Chapter_7;

public class ReferenceType_Test {

	public ReferenceType_Test() {//매개변수가 없는 생성자의 경우  아래와같은 기본생성자들이 없는경우 생략이 가능하다.
		// TODO Auto-generated constructor stub //생성자 생성한뒤에는 생성되는 객체에 갯수는 상관이없다. 
	}

	public ReferenceType_Test(String string) {     
		// TODO Auto-generated constructor stub
	}


	public ReferenceType_Test(String string, String string2) {
		// TODO Auto-generated constructor stub
	}


	public ReferenceType_Test(String string, int number){
		
	}
	public ReferenceType_Test(String string, String string2, int number){
		
	}
	
	public static void main(String[] args) {
		ReferenceType_Test reference = new ReferenceType_Test();
		ReferenceType_Test test1 = new ReferenceType_Test("a");
		ReferenceType_Test test2 = new ReferenceType_Test("a","b");
		ReferenceType_Test test3 = new ReferenceType_Test("a", 1);
		ReferenceType_Test test4 = new ReferenceType_Test("a","b",1);
		ReferenceType_Test test5 = new ReferenceType_Test("a","b",1);
		ReferenceType_Test test6 = new ReferenceType_Test("a","b",1);
		
		
	}
}
