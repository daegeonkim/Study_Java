package Book;

public class OuterOfStatic {
	private int value2;
	public static void main(String[] args) {
		OuterOfStatic.StaticNested test = new OuterOfStatic.StaticNested();
		OuterOfStatic test2 = new OuterOfStatic();
		test.setValue(93);
		System.out.println(test.getValue());
		
		test.setValue2(22); // static nested 클래스는 겉 클래스의 private 변수에는 접근할수없다 *Static 이니까.
		test2.setValue2(22); // 겉클래스로 선언한 객체는 private변수가 연결된 메소드를 정상 사용할수있는점이 확인된다.
		
		
	}
	
	public int getValue2(){
		return value2;
	}
	public void setValue2(int value2){
		this.value2 = value2;
	}
	
	
	static class StaticNested{
		private int value =0;
		public int getValue(){
			return value;
		}
		public void setValue(int value){
			this.value=value;
		}
	}
}
