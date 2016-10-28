package chess.board;

import java.util.List;

import chess.pieces.Piece;
import util.StringUtil;
import java.util.*;

public class Print{

	
	
	
	
	public static void printBoard() { // 각 가로라인 출력  
		StringBuilder sb = new StringBuilder();
		for (List<Piece>list1 : Board.getBoard() ) {
			for(Piece piece  : list1){
				sb.append(piece.getRepresentation());
			}
			sb.append(StringUtil.appendNewLine(""));
		}
		System.out.println(sb.toString());
	}
	
}
