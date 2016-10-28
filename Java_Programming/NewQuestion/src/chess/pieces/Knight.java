package chess.pieces;

import enums.Colors;
import enums.Types;

public class Knight extends Piece {

	private char representation = 'n';
	private double score = 2.5;
	
	
	public Knight(Colors color) {
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}


	public static Piece create(Colors color) {
		return new Knight(color);
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
		
		return this.color.toString();
	}
		
}
