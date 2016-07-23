package Question.chess;
import java.util.*;

import Question.pieces.Pawn;
import pieces.*;


public class Board {
	public ArrayList<Pawn> pawns = new java.util.ArrayList<Pawn> (); 	
	static final String NEWLINE = System.getProperty("line.separator");
	
	
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
		
		ArrayList<Pawn> whiteLine = new ArrayList<Pawn>();
		ArrayList<Pawn> blackLine = new ArrayList<Pawn>();
		
		
		Pawn whitePawn = new Pawn();
		Pawn blackPawn = new Pawn("Black");
		
		StringBuilder lines = new StringBuilder();
		
		lines.append(NEWLINE);
		
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		whiteLine.add(whitePawn);
		
		for(Pawn aa :whiteLine){
			lines.append(aa.getMark());	
		}
		lines.append(NEWLINE);
		lines.append(NEWLINE);
		lines.append(NEWLINE);
		lines.append(NEWLINE);
		lines.append(NEWLINE);
		lines.append(NEWLINE);
		
		
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		blackLine.add(blackPawn);
		
		for(Pawn bb :blackLine){
			lines.append(bb.getMark());	
		}
		System.out.println(lines);
	}
}



//보드 객체 만든다
// 객체만들고 해당 객체에 폰을 가함
