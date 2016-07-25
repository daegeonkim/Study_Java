package Question.chess;
import java.util.*;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import Question.pieces.Pawn;
import pieces.*;


public class Board {
	public ArrayList<Pawn> pawns = new java.util.ArrayList<Pawn> (); 	
	static final String NEWLINE = System.getProperty("line.separator");
	final static String WHITE = "White";
	final static String BLACK = "Black";
	final static int PAWN_AMOUNT = 7;
	final static int BOARD_ROW = 8;
	final static int BOARD_COL = 8;

	
	
	public Board(){
		Pawn test1 = new Pawn();
		pawns.add(test1);
		Pawn test2 = new Pawn();
		pawns.add(test2);
		Pawn test3 = new Pawn();
		pawns.add(test3);
	}
	
	void enroll(Pawn pawn){
		pawns.add(pawn);
	}
	
	int getNumberofPawns(){
		return pawns.size();
	}

	void initialize(){
		
		Pawn whitePawn = new Pawn(WHITE);
		Pawn blackPawn = new Pawn(BLACK);
		
		StringBuilder lines = new StringBuilder(); // 체스판 출력하는 라인
		
		for(int whole = 0 ;whole < 9; whole++){
			lines.append(NEWLINE);
		}
		

		
		for(int blank = 0; blank<5; blank++){
			lines.append(NEWLINE);
		}
		
		
		for(int black = 0 ; black <= PAWN_AMOUNT ; black ++){
			lines.append(blackPawn.getMark());
		}
		
		System.out.println(lines);
	}
}



//보드 객체 만든다
// 객체만들고 해당 객체에 폰을 가함
