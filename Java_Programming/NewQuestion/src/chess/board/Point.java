package chess.board;

import chess.pieces.*;
import enums.*;
import util.*;

public class Point extends Board {

	
	public Piece goTo(Location location){
		return board.get(location.getColumn()).get(location.getRow());
		}
	
	// makeIn 메소드를 위한 유틸리티 메소드  
	// 테스트에서 가로를 a~h, 세로를 1~8 로 받아오길 원하여 위에 배열을 선언 후 
	// 해당 index 번호와 연동시켜 처리함  
	//noPice 도 객체이기때문에 해당 인덱스에 객체 생성후 +1 한 객체 삭제함 
	private void addIn(Location location, Piece piece){
		board.get(location.getColumn()).add(location.getRow(), piece);
		board.get(location.getColumn()).remove(location.getRow()+1);
	}
	
	// 특정 위치에 원하는말을 생성 
	public void makeIn(Location location, Colors color, Class className) {
		Piece piece = Factory.create(color, className);
		addIn(location, piece);
	}

	// 특정 위치에 어떤말이 있는지 확
	public char whtaIsIn(Location location){
		return goTo(location).getRepresentation();
	}
	
	// 원하는 위치에 noPiece를 놓는다
	// 객체가 있을경우 noPiece로 교체함.
	public void makeNoPieceIn(Location location){
		board.get(location.getColumn()).add(location.getRow(), Factory.createNoPiece());
		board.get(location.getColumn()).remove(location.getRow()+1);
	}

			
//			//TODO 보드 위치 검색시 인덱스값0 및 가로열 변환을 위한 배열  
//			String [] num1 = {"a","b","c","d","e","f","g","h"};
//			int [] num2 = {8,7,6,5,4,3,2,1};
//			
	
//	public Piece goTo(String row, int column){
//		for (int j2 = 0; j2 < num1.length; j2++) {
//			if(num1[j2] == row){
//				for (int j1 = 0; j1 < num2.length; j1++) {
//					if(num2[j1] == column)
//						return board.get(j1).get(j2);
//				}
//			}
//		}
//		return null;
//		}
//	
//	// makeIn 메소드를 위한 유틸리티 메소드  
//	// 테스트에서 가로를 a~h, 세로를 1~8 로 받아오길 원하여 위에 배열을 선언 후 
//	// 해당 index 번호와 연동시켜 처리함  
//	//noPice 도 객체이기때문에 해당 인덱스에 객체 생성후 +1 한 객체 삭제함 
//	private void addIn(String row, int i, Piece piece){
//		for (int j2 = 0; j2 < num1.length; j2++) {
//			if(num1[j2] == row){// 1
//				for (int j1 = 0; j1 < num2.length; j1++) {
//					if(num2[j1] == i){ //1
// 						board.get(j1).add(j2, piece);
//						board.get(j1).remove(j2+1);
//					}
//				}	
//			}	
//		}
//	}
//	
//	// 특정 위치에 원하는말을 생성 
//	public void makeIn(String row, int column, Colors color, Types type) {
//		Piece piece = Factory.create(color, type);
//		addIn(row, column, piece);
//	}
//
//	// 특정 위치에 어떤말이 있는지 확
//	public char whtaIsIn(String num, int column){
//		return goTo(num, column).getRepresentation();
//	}
//	
//	public int test1(){
//		return board.size();
//
//	}	
}
