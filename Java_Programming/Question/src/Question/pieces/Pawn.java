package Question.pieces;

public class Pawn {
	String color;
	final static String WHITE = "White";
	final static String BLACK = "Black";
	final static String WHITE_MARK = "p";
	final static String BLACK_MARK = "P";
	private String mark = " "; 
	
	
	public Pawn(){
		this(WHITE);
		
		
	}
	
	public Pawn(String color){	
		this.color = color;
		if(color=="Black"){
			mark = BLACK_MARK ;		
		}
		else if (color == "White"){
			mark = WHITE_MARK;
		}
	}
	
	
	public String getColor(){
		return color;
	}
	
	public String getMark(){
		return mark;
	}
}
