package chess.pieces;

import enums.Colors;
import enums.Types;

public class King extends Piece{

	private char representation = 'k';
	private double score =10.0;

	
	private King(Colors color) {
		
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}
	
	public static  Piece create(Colors color){
		return new King(color);
	}

	
	
	@Override
	public char getRepresentation() {
		return representation;		
	}

	@Override
	public double getScore() {

		return score;
	}

	@Override
	public String getColor() {
		
		return this.color.toString();
	}
}
