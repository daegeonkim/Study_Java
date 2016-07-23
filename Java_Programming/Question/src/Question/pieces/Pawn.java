package Question.pieces;

public class Pawn {
	String color;
	final static String WHITE = "White";
	final static String BLACK = "Black";
	private String mark = " "; 
	
	
	public Pawn(){
		this(WHITE);
		mark = "p";
		
	}
	
	public Pawn(String color){	
		this.color = color;
		if(color=="Black"){
			mark = "P";		
		}
	}
	
	public String getColor(){
		return color;
	}
	
	public String getMark(){
		return mark;
	}
}
