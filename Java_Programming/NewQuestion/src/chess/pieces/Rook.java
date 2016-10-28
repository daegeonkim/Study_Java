package chess.pieces;

import enums.Colors;
import enums.Types;

public class Rook extends Piece{
	
	private char representation = 'r';
	private double score = 5.0;
	
	public Rook(Colors color) {
		
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}


	public static Piece create(Colors color) {

		return new Rook(color);
	}

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
		
		return this.color.toString();
	}
}
