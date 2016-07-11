package Question;

public class PawnTest extends junit.framework.TestCase { // 메소드 없이 실행하여 테스트 메소드가 없어 실행안되는점 확인.
	
	public void test_Create(){
		String firstPawnColor = "White";
		String secondPawnColor = "Black";
		Pawn first = new Pawn(firstPawnColor);
		Pawn second = new Pawn(secondPawnColor);
		first.getColor();
		second.getColor();
		
	}
	

}

class Pawn{
	String color;
	public Pawn(String color){
		this.color=color;		
	}
	
	public String getColor(){
		return color;
	}
	
}