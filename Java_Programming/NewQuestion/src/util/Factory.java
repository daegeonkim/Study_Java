package util;

import chess.pieces.*;
import enums.Colors;
import enums.Types;

public class Factory {
	
	public static Piece create(Colors color, Class className){
		if(color == Colors.WHITE){
			if (className.equals(King.class)) {
				return King.create(color);
			}
			if (className.equals(Queen.class)) {
				return Queen.create(color);
			}
			if (className.equals(Rook.class)) {
				return Rook.create(color);
			}
			if (className.equals(Bishop.class)) {
				return Bishop.create(color);
			}
			if (className.equals(Knight.class)) {
				return Knight.create(color);
			}
			if (className.equals(Pawn.class)) {
				return Pawn.create(color);
			}		
		}
		
		if(color == Colors.BLACK){
			if (className.equals(King.class)) {
				return King.create(color);
			}
			if (className.equals(Queen.class)) {
				return Queen.create(color);
			}
			if (className.equals(Rook.class)) {
				return Rook.create(color);
			}
			if (className.equals(Bishop.class)) {
				return Bishop.create(color);
			}
			if (className.equals(Knight.class)) {
				return Knight.create(color);
			}
			if (className.equals(Pawn.class)) {
				return Pawn.create(color);
			}		
		}
		return null;
	}
	
	public static Piece createNoPiece(){
		return Blank.create();
	}
}
