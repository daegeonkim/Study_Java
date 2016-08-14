package chess;

import junit.framework.TestCase;
import util.StringUtil;

import java.util.*;


public class BoardTest extends TestCase {	
	private Board board;
	
	protected void setUp(){
		board = new Board();
	}
	
	public void testCreate(){
		Board board = new Board();
		assertNotNull(board);
		
		board.initialize();
		
		assertEquals("PPPPPPPP", board.printLine(1));
		assertEquals("pppppppp", board.printLine(6));
	}
	
	public void testInit() {
		board.initialize();
		
		List<List<Piece>> boardList = board.getBoard();
		assertNotNull(boardList);
		assertEquals(8, boardList.size());
	}
	
	public void testAddPawn(){
		board.addPawn(Piece.createPawn(Piece.WHITE, "P"));
		assertEquals(1, board.getAllPawn());
	}
	
	public void testGetAllPawn(){
		int pawnSize = board.getAllPawn();
		assertEquals(0, pawnSize);	
	}
	
	public void testGetPanwList(){
		Piece whitePawn = Piece.createPawn(Piece.WHITE, "P");
		Piece blackPawn = Piece.createPawn(Piece.WHITE, "P");
		board.addPawn(whitePawn);
		board.addPawn(blackPawn);
		List<Piece> pawnList = board.getPawnList();
		
		assertNotNull(pawnList);
		assertEquals(pawnList.get(0), whitePawn);
		assertEquals(pawnList.get(1), blackPawn);
	}
	
	
	
	public void testCreate2(){
		board.initialize();
		assertEquals(32, board.pieceCount());
		String blankRank = StringUtil.appendNewLine("........");
		
		assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
				StringUtil.appendNewLine("PPPPPPPP") +
				blankRank+blankRank+blankRank+blankRank+
				StringUtil.appendNewLine("pppppppp")+
				StringUtil.appendNewLine("rnbqkbnr")	
				
				, board.printBoard());		
	}
	
}
