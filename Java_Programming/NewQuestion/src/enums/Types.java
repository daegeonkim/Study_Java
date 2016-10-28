package enums;

public enum Types {
	KING('k', 0.0), QUEEN('q', 9.0), ROOK('r', 5.0), BISHOP('b', 3.0), KNIGHT('n', 2.5), PAWN('p', 1.0), BLANK('.', 0.0);
	
	private char representation;
	private double score;
	
	Types(char representation, double score){
		this.representation = representation;
		this.score = score;
	}
	
	public char getRepresentation(){
		return representation;
	}
	
	public void makeBlack(){
		representation = Character.toUpperCase(representation);
	}
	
	public double getScore(){
		return score;
	}

}
