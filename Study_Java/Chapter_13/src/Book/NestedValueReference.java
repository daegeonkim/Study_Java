package Book;

public class NestedValueReference {
	public int publicInt =0;
	protected int protectedInt =1;
	int justInt = 2;
	private int privateInt = 3;
	static int staticInt = 4;
	
	
	static class StaticNested { // static nested클래스의 경우 static 으로 선언됬기때문에 static 한 클래스변수만 참조할수있다.
		public void setValue(){
			staticInt =14;
		}
	}

	class Inner{
		private int innerValue = 100;
		public void setValue(){
			publicInt = 20;
			protectedInt = 21;
			justInt= 22;
			privateInt = 23;
			staticInt = 24;
		}
	}
	public void setValue(){
		publicInt = 30;
		protectedInt = 31;
		justInt = 32;
		privateInt =33;
		staticInt = 34;
		
	}
	
	public void setValue(int value){  // overload
		NestedValueReference outer = new NestedValueReference(); // 
		NestedValueReference.Inner test = outer.new Inner();// 객체를 선언한다
		test.innerValue = value; // 해당 이너 객체에 서 선언한 메소드 밸류값을 매개변수로 받은 값으로 변경함.
	}
	






}
