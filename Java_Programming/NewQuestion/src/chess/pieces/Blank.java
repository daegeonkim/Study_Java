package chess.pieces;

import enums.*;

public class Blank extends Piece{
	
	private char representation = '.';
	private double score;
	
	
	private Blank(){
	}


	public static Piece create() {
		return new Blank();
	}

	@Override
	public char getRepresentation() {
		return representation;
		
	}

	@Override
	public double getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	
	@Override
	public String getColor() {
		return null;
	}
	
}
