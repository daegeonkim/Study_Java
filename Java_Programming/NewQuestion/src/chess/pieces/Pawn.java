package chess.pieces;

import enums.Colors;
import enums.Types;

public class Pawn extends Piece{

	private char representation = 'p';
	private double score= 1.0;
	private boolean mark = true;
	
	public Pawn(Colors color) {
		if (color==Colors.WHITE) {
			this.color = color;
		}
		if (color == Colors.BLACK){
			this.color = color;
			representation = Character.toUpperCase(representation);
		}	
	}

	
	public static Piece create(Colors color) {
		// TODO Auto-generated method stub
		return new Pawn(color);
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
	
	
	public boolean checkPawn(){
		return mark;	
	}
	
	public void markPawn(){
		mark = false;
	}
	
	
}
