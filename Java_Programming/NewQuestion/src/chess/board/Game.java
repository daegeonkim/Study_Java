package chess.board;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Piece;
import chess.pieces.Queen;
import chess.pieces.Rook;
import enums.*;
import sun.font.CreatedFontTracker;
import util.Factory;

public class Game extends Point{
	
	private List<List<Piece>> board = Board.getBoard();
	
	
	
	
	private boolean checkKing(Colors color, Location location){


		if (getColumn(color, King.class) - location.getColumn() < 2) {
			
			
			if (getRow(color, King.class) - location.getRow() <2) {
				
				return true;
			}
			if (getRow(color, King.class) - location.getRow() > -2) {
				
				if (getRow(color, King.class) - location.getRow() < 2) {
				
					return true;
				}
			}
		}
		
		if (getColumn(color, King.class) - location.getColumn() > -2) {
			if (getRow(Colors.WHITE, King.class) - location.getRow() <2) {
				return true;
			}
			if (getRow(color, King.class) - location.getRow() > -2) {
				if (getRow(color, King.class) - location.getRow() < 2) {
					return true;
				}
			}
		}
		
		return false;

	}
	
	// 가로 세로 둘중에 하나만 이동하는지 확인함 
	private boolean checkRook(Colors color, Location location){
		
		if (getColumn(color, Rook.class) != location.getColumn()) {
			if (getRow(color, Rook.class) == location.getRow()) {
				return true;
			}
		}
		
		if (getRow(color, Rook.class) != location.getRow()) {
			if (getColumn(color, Rook.class) == location.getColumn()) {
				return true;
			}
		}
		return false;
	}

	private boolean checkBishop(Colors color, Location location){
		int row = getRow(color, Bishop.class) - location.getRow();
		int column = getColumn(color, Bishop.class) - location.getColumn();

		if (column == row) {
			System.out.println("passed");
			return true;
		}
		
		if (column == (-row)){
			System.out.println("passed");
			return true;
		}
		return false;

	}
	
	
	private boolean checkQueen(Colors color, Location location){

		if (getColumn(color, Queen.class) != location.getColumn()) {
			if (getRow(color, Queen.class) == location.getRow()) {
				return true;
			}
		}
		
		if (getRow(color, Queen.class) != location.getRow()) {
			if (getColumn(color, Queen.class) == location.getColumn()) {
				return true;
			}
		}
		
		
		int row = getRow(color, Queen.class) - location.getRow();
		int column = getColumn(color, Queen.class) - location.getColumn();

		if (column == row) {
			System.out.println("passed");
			return true;
		}
		
		if (column == (-row)){
			System.out.println("passed");
			return true;
		}
		return false;

		
		
		
	}
	
	
	
	
	
	
	
	public void moveRook(Colors color, Location location){
		if (checkRook(color, location)) {
			removePiece(getRow(color, Rook.class), getColumn(color, Rook.class));
			makeIn(location, color, Rook.class);
		}
		else{
			System.out.println("Check Location");
		}
	}
	
	
	public void moveKing(Colors color, Location location){
		
		if (checkKing(color, location)) {

			
			removePiece(getRow(color, King.class), getColumn(color, King.class));
			makeIn(location, color, King.class);
	
		}
		
		else{
			System.out.println("Check Location");
		}
	}

	
	public void moveBishop(Colors color, Location location){
		if (checkBishop(color, location)) {
			removePiece(getRow(color, Bishop.class), getColumn(color, Bishop.class));
			makeIn(location, color, Bishop.class);
		}
		else {
			System.out.println("Check Location");
		}
	}
	
	
	public void moveQueen(Colors color, Location location) {
		if (checkQueen(color, location)) {
			removePiece(getRow(color, Queen.class), getColumn(color, Queen.class));
			makeIn(location, color, Queen.class);
		}
		else
			System.out.println("check location");
		
	}

	
	
	
	
	/** 원하는 색의 말을 찾은뒤 위치값을 배열값으로 리턴함*/ 
 	public int[] findPiece(Colors color, Class className){
		int [] location;
		int column = -1;
		
		for(List<Piece> line : board){
			column++;
			int row=-1;
			for (Piece piece1 : line) {
				row++;

				if (piece1.getClass().equals(className)) {
					if (piece1.getColor() == color.toString()) {
						location = new int [] {column, row};
						return location;
					}	
				}
			}
		}
		return null;
 	}
 	
	
	
	/**findPiece 에서 받은 배열에서 가로값을 리턴함 */
	public int getRow(Colors color, Class className){
		return findPiece(color, className)[1]; 
		}
	
	/**findPiece 에서 받은 배열에서 세로값을 리턴함 */
	public int getColumn(Colors color, Class className){
		return findPiece(color, className)[0]; 
		}
	
	public void removePiece(int row, int column){
		board.get(column).add(row, Factory.createNoPiece());
		board.get(column).remove(row+1);
	}


	
}


