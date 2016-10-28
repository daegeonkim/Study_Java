package chess.pieces;

import enums.Colors;
import enums.Types;

public class Queen extends Piece{
	private char representation = 'q';
	private double score = 9.0;
	
	
	public Queen(Colors color) {
		
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}

	
	public static Piece create(Colors color) {
	
		return new Queen(color);
	}

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
