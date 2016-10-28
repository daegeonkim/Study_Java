package chess.board;


import chess.pieces.*;
import enums.Colors;
import enums.Types;
import junit.framework.TestCase;

public class MoveTest extends TestCase {
	
	private Board board;
	private Point pointer;
	private Score scorer;
	private Game move;
	
	protected void setUp(){
		board = new Board();
		pointer = new Point();
		scorer = new Score();
		move = new Game();
		
	}
	
	
	public void testFindPiece(){
		board.setEmptyBoard();
		pointer.makeIn(Location.f1, Colors.WHITE, Pawn.class);
		
		assertEquals(Location.f1.getRow(), move.getRow(Colors.WHITE, Pawn.class));
		assertEquals(Location.f1.getColumn(), move.getColumn(Colors.WHITE, Pawn.class));
	}
	
	/** 킹은 어느방향이나 1칸만 움직일수있는 내용에 대한 테스트 */
	public void testMoveKing(){
		// 킹을 만들고 위로 한캄 움직임 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, King.class);
		move.moveKing(Colors.WHITE, Location.f4);
		assertEquals(move.getRow(Colors.WHITE, King.class), Location.f4.getRow());
		assertEquals(move.getColumn(Colors.WHITE, King.class), Location.f4.getColumn());
		
		// 킹을 만들고 아래로 한캄 움직임 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, King.class);
		move.moveKing(Colors.WHITE, Location.f6);
		assertEquals(move.getRow(Colors.WHITE, King.class), Location.f6.getRow());
		assertEquals(move.getColumn(Colors.WHITE, King.class), Location.f6.getColumn());

		// 킹을 만들고 좌로 한캄 움직임 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, King.class);
		move.moveKing(Colors.WHITE, Location.e4);
		assertEquals(move.getRow(Colors.WHITE, King.class), Location.e4.getRow());
		assertEquals(move.getColumn(Colors.WHITE, King.class), Location.e4.getColumn());

		 //킹을 만들고 우로 한캄 움직임 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, King.class);
		move.moveKing(Colors.WHITE, Location.g4);
		assertEquals(move.getRow(Colors.WHITE, King.class), Location.g4.getRow());
		assertEquals(move.getColumn(Colors.WHITE, King.class), Location.g4.getColumn());
	}

	
	public void testmoveRook(){
		// 룩을 가장 아래칸으로 옮김 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, Rook.class);
		System.out.println("before"+'\n'); Print.printBoard();
		move.moveRook(Colors.WHITE, Location.f1);
		assertEquals(move.getRow(Colors.WHITE, Rook.class), Location.f1.getRow());
		assertEquals(move.getColumn(Colors.WHITE, Rook.class), Location.f1.getColumn());
		System.out.println("after"+'\n'); Print.printBoard();
	
	//	 룩을 가장 위칸으로 옮김 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, Rook.class);
		System.out.println("before"+'\n'); Print.printBoard();
		move.moveRook(Colors.WHITE, Location.f8);
		assertEquals(move.getRow(Colors.WHITE, Rook.class), Location.f8.getRow());
		assertEquals(move.getColumn(Colors.WHITE, Rook.class), Location.f8.getColumn());
		System.out.println("after"+'\n'); Print.printBoard();
		System.out.println("after"+'\n'); Print.printBoard();
		// 룩을 가장 오른쪽 칸으로 옮김 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, Rook.class);
		System.out.println("before"+'\n'); Print.printBoard();
		move.moveRook(Colors.WHITE, Location.h5);
		assertEquals(move.getRow(Colors.WHITE, Rook.class), Location.h5.getRow());
		assertEquals(move.getColumn(Colors.WHITE, Rook.class), Location.h5.getColumn());
		System.out.println("after"+'\n'); Print.printBoard();

//		 룩을 가장 왼쪽 칸으로 옮김 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, Rook.class);
		System.out.println("before"+'\n'); Print.printBoard();
		move.moveRook(Colors.WHITE, Location.h5);
		assertEquals(move.getRow(Colors.WHITE, Rook.class), Location.h1.getRow());
		assertEquals(move.getColumn(Colors.WHITE, Rook.class), Location.h1.getColumn());
		System.out.println("after"+'\n'); Print.printBoard();

	//	 규칙외의 이동 
		board.setEmptyBoard();
		pointer.makeIn(Location.f5, Colors.WHITE, Rook.class);
		move.moveRook(Colors.WHITE, Location.a1);
	}
	
	public void testMoveBishop(){
		System.out.println("Bishop Test");
		board.setEmptyBoard();
		pointer.makeIn(Location.d4, Colors.WHITE, Bishop.class);
		System.out.println("before"+'\n'); Print.printBoard();
		
		move.moveBishop(Colors.WHITE, Location.g7);
		System.out.println("after"+'\n'); Print.printBoard();
	}
	
	public void testMoveQueen(){
		System.out.println('\n');
		System.out.println("Queen Test");
		
		board.setEmptyBoard();
		pointer.makeIn(Location.d4, Colors.WHITE, Queen.class);
		System.out.println("before"+'\n'); Print.printBoard();
		
		move.moveQueen(Colors.WHITE, Location.d1);
		System.out.println("after"+'\n'); Print.printBoard();
		
		move.moveQueen(Colors.WHITE, Location.f6);
		System.out.println("after"+'\n'); Print.printBoard();
	}
	
}