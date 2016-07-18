package chess;
import java.util.*;
import pieces.Pawn;


public class Board {
	public ArrayList<Pawn> pawns = new java.util.ArrayList<Pawn> (); 	
	
	public Board(){

	}
	
	void enroll(Pawn pawn){
		pawns.add(pawn);
	}
	
	int getNumberofPawns(){
		return pawns.size();
	}
}



//보드 객체 만든다
// 객체만들고 해당 객체에 폰을 가함
