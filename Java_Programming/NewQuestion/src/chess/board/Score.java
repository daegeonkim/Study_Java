package chess.board;

import java.util.*;
import chess.pieces.*;
import enums.*;
import enums.Types;


public class Score extends Board {
	
	// 색, 말 별 갯수 파악을 위한 리스트 
	private List<Piece> PawnList = new ArrayList<>();
	private List<Piece> RookList = new ArrayList<>();
	private List<Piece> KnightList = new ArrayList<>();
	private List<Piece> BishopList = new ArrayList<>();
	private List<Piece> QueenList = new ArrayList<>();
	private List<Piece> KingList = new ArrayList<>();
	
	/**세로줄에 폰이 있을경우 0.5 점을 반환하기 위한 필드 */ 
	private double whitePawnScore =0;
	private double blackPawnScore =0;
	
	
	/**세기, 점수와 말 종류를 연결하는 맵 */
	Map<Class, Double> pieceMap = null;
	
	
	/**점수를 헤아리는 리스트를 초기화함**/
	private void refreshList(){
		BishopList.clear();
		KingList.clear();
		KnightList.clear();
		PawnList.clear();
		QueenList.clear();
		RookList.clear();
	}

	/**원하는 색의 말이 총 몇개인지 확인함 
	 * countPiece 를 위한 유틸리티 메소*/
	private void getAllPiece(Colors color){
		refreshList();
		for(List<Piece> pieces : board){
			for(Piece piece : pieces){
				if(piece.getColor() == color.toString()){
					switch (piece.getRepresentation()) {
					case 'p': 
						PawnList.add(piece);
						break;

					case 'r': 
						RookList.add(piece);
						break;
						
					case 'b': 
						BishopList.add(piece);
						break;
						
					case 'n': 
						KnightList.add(piece);
						break;
						
					case 'q': 
						QueenList.add(piece);
						break;
						
					case 'k': 
						KingList.add(piece);
						break;	
					}		
					System.out.println("WHITE:"+
					PawnList.size());
				}
				if(piece.getColor() == color.toString()){
					switch (piece.getRepresentation()) {
					case 'P': 
						PawnList.add(piece);
						break;

					case 'R': 
						RookList.add(piece);
						break;
						
					case 'B': 
						BishopList.add(piece);
						break;
						
					case 'N': 
						KnightList.add(piece);
						break;
						
					case 'Q': 
						QueenList.add(piece);
						break;
						
					case 'K': 
						KingList.add(piece);
						break;	
					}	
					System.out.println("Black"+PawnList.size());
				}
			}
		}
	}
		
	/**특정 색의 특정 말 갯수를 카운트함**/
	public int countPiece(Colors color, Class className){
		refreshList();
		getAllPiece(color);
		if (className.equals(King.class)) {
			return KingList.size();
		}
		if (className.equals(Queen.class)) {
			return QueenList.size();
		}
		if (className.equals(Rook.class)) {
			return RookList.size();
		}
		if (className.equals(Bishop.class)) {
			return BishopList.size();
		}
		if (className.equals(Knight.class)) {
			return KnightList.size();
		}
		if (className.equals(Pawn.class)) {
			return PawnList.size();
		}
					return -1;
		
	}
	
	
	/**세로에 폰이 있는지 확인 후 점수를 처리하는 메소드 
	 * checkScore 에 대한 유틸리티메소**/
	private void checkPawnScore(){
		whitePawnScore = 0;
		blackPawnScore = 0;
		
		for (int i = 0; i < board.size(); i++) {
				int a = 0;
				int b = 0;
			for (int j = 0; j < board.get(i).size(); j++) {
				if (board.get(j).get(i).getRepresentation() == 'p') {
						a++;
						if (a >=2) {
							whitePawnScore = a;
					}		
				}
				if (board.get(j).get(i).getRepresentation() == 'P') {
					b++;
					if (b >= 2) {
						blackPawnScore = a;
					}
				}			
			}	
		}		
	}
	
	
	/**판위에 있는 말들에 대한 점수를 반환함 */
	public double checkScore(Colors color){
		double score = 0.0;
		checkPawnScore();

		
		for(List<Piece> line : board){
			for(Piece piece : line){
				if (piece.getColor() == color.toString()) {
					score = score + piece.getScore();
				}
	
			}
		}
		if (whitePawnScore > 0) {
			return score - whitePawnScore*0.5;	
		}
		else {
			return score;
		}
	}
	
	/** 말 세기(점수) 순으로 정렬해서 출력*/
	public List<Piece> getSortedList(Colors color) {
		List<Piece> sortedList = new ArrayList<>();
		
		for (List<Piece> list : board) {
			for (Piece piece : list) {
				if(piece.getColor() == color.toString())
					sortedList.add(piece);
			}
		}
		Collections.sort(sortedList);
		return sortedList;
	}
	
	public Double getPieceMap(Class className){
		return getPieceMaps().get(className);
	}
	
	private Map<Class, Double> getPieceMaps(){
		if (pieceMap == null) {
			loadPieceMap();			
		}
		return pieceMap;
	}

	private void loadPieceMap() {
		pieceMap = new HashMap<>();
		pieceMap.put(King.class, 10.0);
		pieceMap.put(Queen.class, 9.0);
		pieceMap.put(Rook.class, 5.0);
		pieceMap.put(Bishop.class, 3.0);
		pieceMap.put(Knight.class, 2.5);
		pieceMap.put(Pawn.class, 1.0);
	}
	

}
