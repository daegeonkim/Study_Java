package chess;

import java.util.ArrayList;
import java.util.List;
import util.StringUtil;

public class Board {
	
	private List<List<Piece>> board;
	
	private List<Piece> pawnList;
	
	public Board(){
		pawnList = new ArrayList<>();
		board = new ArrayList<>();
	}
	
	public void addPawn(Piece pawn) {
		pawnList.add(pawn);
	}

	public int getAllPawn() {
		return pawnList.size();
	}
	
	public int pieceCount() { // 전체 보드위에  piece 객체가 몇개있는지 확인한다.
		int checkSize = 0;
		for(List<Piece> pieceLists:board){
			checkSize = checkSize+pieceLists.size();
			}
		return checkSize;
	
	}


	public List<Piece> getPawnList() {
		return pawnList;
	}

	public void initialize() {
		Piece pieceR = Piece.createPawn(Piece.WHITE, "R") ;
		Piece pieceN = Piece.createPawn(Piece.WHITE, "N") ;
		Piece pieceB = Piece.createPawn(Piece.WHITE, "B") ;
		Piece pieceQ = Piece.createPawn(Piece.WHITE, "Q") ;
		Piece pieceK = Piece.createPawn(Piece.WHITE, "K") ;
		
		Piece piecer = Piece.createPawn(Piece.BLACK, "r") ;
		Piece piecen = Piece.createPawn(Piece.BLACK, "n") ;
		Piece pieceb = Piece.createPawn(Piece.BLACK, "b") ;
		Piece pieceq = Piece.createPawn(Piece.BLACK, "q") ;
		Piece piecek = Piece.createPawn(Piece.BLACK, "k") ;
		
		
		// TODO 라인을 생성한다 
		for (int i=0; i<8; i++) { //7개 가로 리스트를 만
			board.add(new ArrayList<Piece>());
		}

		//
		board.get(0).add(pieceR);	board.get(0).add(pieceN);	board.get(0).add(pieceB);	board.get(0).add(pieceQ);	
		board.get(0).add(pieceK);	board.get(0).add(pieceB);	board.get(0).add(pieceN);	board.get(0).add(pieceR);
		
		board.get(7).add(piecer);	board.get(7).add(piecen);	board.get(7).add(pieceb);	board.get(7).add(pieceq);	
		board.get(7).add(piecek);	board.get(7).add(pieceb);	board.get(7).add(piecen);	board.get(7).add(piecer);
		
		
		//  2번째 라인에7개의희색폰을 추가한다
		for(int i = 0; i<8 ; i++){
			board.get(1).add(Piece.createPawn(Piece.WHITE, "P"));
		}
		// 7번째에 7개의 검정폰을 추가한다.
		for(int i = 0; i<8 ; i++){
			board.get(6).add(Piece.createPawn(Piece.BLACK, "p"));
		}
		
	}
	//각 가로열을 불러와서 가로열의 사이즈를 확인했을때, 0인경우 . 7개를 리턴한다.
	
	
	// 원하는 라인을 출력
	public String printLine(int lineNumber){ 
		List<Piece> pawnList = board.get(lineNumber);
		
		
		// 8개가 아닐때. 
		// ...... 출력
		if (pawnList.size() != 8) {
			return "........";
		}
				
		//7개일때 폰의 타입을 모두 불러와서 출력
		StringBuilder sb = new StringBuilder();
		
		for (Piece pawn : pawnList) {
			sb.append(pawn.getType());
		}
		return sb.toString();
	}

	public List<List<Piece>> getBoard() { 	
		return board;
	}

	public String printBoard() { // 각 가로라인 출력  
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<8; i++) {
			sb.append(printLine(i) + StringUtil.appendNewLine(""));
		}
		
		return sb.toString();
	}
	
	
}
