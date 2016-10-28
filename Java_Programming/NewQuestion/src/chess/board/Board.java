package chess.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.prism.paint.Color;

import chess.pieces.*;
import enums.Colors;
import enums.Types;
import util.Factory;
import util.StringUtil;

public class Board {
	
	protected static List<List<Piece>> board;
	


	//TODO 생성자  
	public Board(){
		board = new ArrayList<>();		
	}

	//TODO 기본 체스판을 세팅함 
	public void initialize() {
		Piece piecer = Factory.create(Colors.WHITE, Rook.class);
		Piece piecen = Factory.create(Colors.WHITE, Knight.class);
		Piece pieceb = Factory.create(Colors.WHITE, Bishop.class);
		Piece pieceq = Factory.create(Colors.WHITE, Queen.class);
		Piece piecek = Factory.create(Colors.WHITE, King.class);
		
		Piece pieceR = Factory.create(Colors.BLACK, Rook.class);
		Piece pieceN = Factory.create(Colors.BLACK, Knight.class);
		Piece pieceB = Factory.create(Colors.BLACK, Bishop.class);
		Piece pieceQ = Factory.create(Colors.BLACK, Queen.class);
		Piece pieceK = Factory.create(Colors.BLACK, King.class);		
		
		// TODO 라인을 생성한다 
		for (int i=0; i<8; i++) {// 7개 가로 리스트를 만
			board.add(new ArrayList<Piece>());
		}


	//	 흰색 첫번째 줄에 중요 기물 추가 
		board.get(0).add(pieceR);	board.get(0).add(pieceN);	board.get(0).add(pieceB);	board.get(0).add(pieceQ);	
		board.get(0).add(pieceK);	board.get(0).add(pieceB);	board.get(0).add(pieceN);	board.get(0).add(pieceR);
		
	//  2번째 라인에7개의 흰색폰을 추가한다
			for(int i = 0; i<8 ; i++){
				board.get(6).add(Factory.create(Colors.WHITE, Pawn.class));
			}
		
		
			
	//	 검은색 첫번째 줄에 중요 기물 추가 
		board.get(7).add(piecer);	board.get(7).add(piecen);	board.get(7).add(pieceb);	board.get(7).add(pieceq);	
		board.get(7).add(piecek);	board.get(7).add(pieceb);	board.get(7).add(piecen);	board.get(7).add(piecer);
		
	//	 7번째에 7개의 검정폰을 추가한다.
		for(int i = 0; i<8 ; i++){
			board.get(1).add(Factory.create(Colors.BLACK, Pawn.class));
		}
		
		for (int i = 0; i < board.size(); i++) {
			if(board.get(i).isEmpty()){
				for (int j = 0; j < 8; j++) {
					board.get(i).add(Factory.createNoPiece());	
				}
			}
			
		}
		
	}
	//각 가로열을 불러와서 가로열의 사이즈를 확인했을때, 0인경우 . 7개를 리턴한다.
	

	public void setEmptyBoard() {
		clearBoard();
		// TODO 라인을 생성한다 
		for (int i=0; i<8; i++) { //7개 가로 리스트를 만
			board.add(new ArrayList<Piece>());
		}
		// 
		for (int i = 0; i < board.size(); i++) {
			if(board.get(i).isEmpty()){
				for (int j = 0; j < 8; j++) {
					board.get(i).add(Factory.createNoPiece());	
				}
			}
			
		}
		
	}

	//게임이 진행되는 판 (*말이 실제 말이 저장되있는)을 리턴한다.(2차원배열임) 
	public  static List<List<Piece>> getBoard() { 	
		return board;
	}
	
	//TODO 게임이 진행되고있는 보드를 초기화 
	public void clearBoard(){
		board.clear();
	}

}


		
