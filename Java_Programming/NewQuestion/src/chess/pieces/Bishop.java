package chess.pieces;

import enums.Colors;
import enums.Types;

public class Bishop extends Piece {
	private char representation = 'b';
	private double score = 3.0;
	
	private Bishop(Colors color) {
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}
	
	public static Bishop create(Colors color) {
		// TODO Auto-generated method stub
		return new Bishop(color);
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
