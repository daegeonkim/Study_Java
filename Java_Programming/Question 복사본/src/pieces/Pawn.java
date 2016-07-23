package pieces;

public class Pawn {
	String color;
	final static String WHITE = "White";
	final static String BLACK = "Black";
	
	
	
	public Pawn(){
		this(WHITE);
	}
	
	public Pawn(String color){	
		this.color = color;
		
	}
	public String getColor(){
		return color;
	}
}
