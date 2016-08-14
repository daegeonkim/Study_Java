package chess;

public class Piece {
	private String color;
	private String type;

	
	public static final String WHITE = "White";
	public static final String BLACK = "Black";
	
	
	
	
	private Piece(String color){
		this.color = color;
	}
	
	private Piece(String color, String type) {
		this.color = color;
		this.type = type;
	}


	public String getColor(){
		return color;
	}


	public String getType() {
		
		return type;
	}
	
	public static Piece createPawn(String color, String type){
		return new Piece(color, type);
	}
	
	
	// 색 확인해서  boolean 타입으로리턴
	public boolean isWhite(){
		return WHITE == this.getColor();
	}
	
	public boolean isBlack(){
		return BLACK == this.getColor();
	}
}
