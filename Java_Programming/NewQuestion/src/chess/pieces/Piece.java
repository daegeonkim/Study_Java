package chess.pieces;

import java.util.*;

import chess.board.Location;
import enums.Colors;
import enums.Types;
public abstract class Piece implements Comparable<Piece>{
	protected Colors color;
	protected char representation ;
	protected double score;
	
	
	
	Piece(){
	}
	
	
	public abstract String getColor();
	public abstract char getRepresentation();
	public abstract double getScore();
	
	
	
	
	
	
	
	public boolean isWhite(){
		return 
			getColor() == Colors.WHITE.toString();
	}
	
	public boolean isBlack(){
		return 	
			getColor() == Colors.BLACK.toString();
	}
	
	public boolean checkPawn(){
		return ((Pawn)this).checkPawn();
	}
	
	public void markPawn(){
		((Pawn)this).markPawn();	
	}
	
	public int compareTo(Piece that){
		double a = this.getScore();
		double b = that.getScore();
		
		if (a > b) {return -1;}
		else if (a == b) {return 0;}
		else {return 1;}
	}
	
 
	public Location getPossibleMove()
	
}

			
			
			
			
			