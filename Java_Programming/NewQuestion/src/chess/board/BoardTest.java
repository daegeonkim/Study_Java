package chess.board;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xml.internal.serialize.Printer;

import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Piece;
import enums.Colors;
import enums.Types;
import junit.framework.TestCase;
import util.Factory;

public class BoardTest extends TestCase{
	private Board board;
	private Point pointer;
	private Score scorer;
	
	
	protected void setUp(){
		board = new Board();
		pointer = new Point();
		scorer = new Score();
	}

	
	
	public void test1(){
//		board.setEmptyBoard();
//		System.out.println(chess.board.Print.printBoard(board.getBoard()));	
	}
	
	// 특정 위치에원하는 색의 말생성하는 테스트 
	public void test2(){
		board.setEmptyBoard();
		
		pointer.makeIn(Location.a8, Colors.WHITE, Pawn.class);
	
		assertEquals('p', pointer.whtaIsIn(Location.a8));
	}
	
	
	// 폰라인 중복된경우 폰스코어 * 05 하는데 
	// 세로에폰끼리 없을경우 점수환산이 안되고있
//	public void testScore(){
//		board.initialize();
//		scorer.getAllPiece();
//		System.out.println(scorer.whitePawnList.size());
//		
//		
//		System.out.println(Print.printBoard(board.getBoard()));
//		System.out.println(scorer.checkScore(Colors.BLACK));
//		System.out.println(scorer.checkScore(Colors.WHITE));
//		assertEquals(38.0, scorer.checkScore(Colors.WHITE));
//		assertEquals(38.0, scorer.checkScore(Colors.BLACK));
//
//	}
	
	

	public void testScore2(){
		board.setEmptyBoard();
		pointer.makeIn(Location.a1, Colors.WHITE, Pawn.class); // 폰 하나 추가 후 점수 확
		assertEquals(1.0, scorer.checkScore(Colors.WHITE));// 1점 정상 패스
		
		board.clearBoard();
		board.initialize();
		Print.printBoard();
		assertEquals(48.0, scorer.checkScore(Colors.WHITE));
		
		board.clearBoard();
		board.setEmptyBoard();
		pointer.makeIn(Location.a8, Colors.WHITE, Pawn.class);
		pointer.makeIn(Location.a7, Colors.WHITE, Pawn.class);
		pointer.makeIn(Location.a6, Colors.WHITE, Pawn.class);
		pointer.makeIn(Location.a5, Colors.WHITE, Pawn.class);
		pointer.makeIn(Location.a4, Colors.WHITE, Pawn.class);
		pointer.makeIn(Location.a3, Colors.WHITE, Pawn.class);

		pointer.makeIn(Location.h8, Colors.BLACK, Pawn.class);
		pointer.makeIn(Location.h7, Colors.BLACK, Pawn.class);
		pointer.makeIn(Location.h6, Colors.BLACK, Pawn.class);
		pointer.makeIn(Location.h5, Colors.BLACK, Pawn.class);
		pointer.makeIn(Location.h4, Colors.BLACK, Pawn.class);
		pointer.makeIn(Location.h3, Colors.BLACK, Pawn.class);

		assertEquals(6, scorer.countPiece(Colors.WHITE, Pawn.class));
		assertEquals(6, scorer.countPiece(Colors.BLACK, Pawn.class));
		
		Print.printBoard();
		assertEquals(3.0, scorer.checkScore(Colors.WHITE));
		assertEquals(3.0, scorer.checkScore(Colors.BLACK));
	}
	
	public void testSort () {
		board.initialize();
		List<Piece> whitePieceList, blackPieceList;
		whitePieceList = scorer.getSortedList(Colors.WHITE);
		blackPieceList = scorer.getSortedList(Colors.BLACK);
		
		// black
		for (int i = 0; i < blackPieceList.size(); i++) {
			System.out.println(blackPieceList.get(i).getRepresentation());
			
		}
		
		
		assertEquals ('K', blackPieceList.get(0).getRepresentation());
		assertEquals ('Q', blackPieceList.get(1).getRepresentation());
		assertEquals ('R', blackPieceList.get(2).getRepresentation());
		assertEquals ('R', blackPieceList.get(3).getRepresentation());
		assertEquals ('B', blackPieceList.get(4).getRepresentation());
		assertEquals ('B', blackPieceList.get(5).getRepresentation());
		assertEquals ('N', blackPieceList.get(6).getRepresentation());
		assertEquals ('N', blackPieceList.get(7).getRepresentation());
		assertEquals ('P', blackPieceList.get(8).getRepresentation());
		assertEquals ('P', blackPieceList.get(9).getRepresentation());
		assertEquals ('P', blackPieceList.get(10).getRepresentation());
		assertEquals ('P', blackPieceList.get(11).getRepresentation());
		assertEquals ('P', blackPieceList.get(12).getRepresentation());
		assertEquals ('P', blackPieceList.get(13).getRepresentation());
		assertEquals ('P', blackPieceList.get(14).getRepresentation());
		assertEquals ('P', blackPieceList.get(15).getRepresentation());
	
		
		
		
		// white
		assertEquals ('k', whitePieceList.get(0).getRepresentation());
		assertEquals ('q', whitePieceList.get(1).getRepresentation());
		assertEquals ('r', whitePieceList.get(2).getRepresentation());
		assertEquals ('r', whitePieceList.get(3).getRepresentation());
		assertEquals ('b', whitePieceList.get(4).getRepresentation());
		assertEquals ('b', whitePieceList.get(5).getRepresentation());
		assertEquals ('n', whitePieceList.get(6).getRepresentation());
		assertEquals ('n', whitePieceList.get(7).getRepresentation());
		assertEquals ('p', whitePieceList.get(8).getRepresentation());
		assertEquals ('p', whitePieceList.get(9).getRepresentation());
		assertEquals ('p', whitePieceList.get(10).getRepresentation());
		assertEquals ('p', whitePieceList.get(11).getRepresentation());
		assertEquals ('p', whitePieceList.get(12).getRepresentation());
		assertEquals ('p', whitePieceList.get(13).getRepresentation());
		assertEquals ('p', whitePieceList.get(14).getRepresentation());
		assertEquals ('p', whitePieceList.get(15).getRepresentation());
	}
	
	public void test33(){
		board.setEmptyBoard();
		board.getBoard().get(0).add(7, Factory.create(Colors.WHITE, King.class));
		Print.printBoard();
	}
	
	public void test44(){
		List<Piece> aa = new ArrayList<>();
		aa.add(Factory.create(Colors.WHITE, King.class));
		System.out.println(aa.get(0));
		assertTrue(aa.contains(King.class));
	}
}
