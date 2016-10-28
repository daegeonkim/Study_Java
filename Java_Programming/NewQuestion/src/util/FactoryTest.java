package util;

import chess.pieces.King;
import chess.pieces.Piece;
import enums.Colors;
import junit.framework.TestCase;

public class FactoryTest extends TestCase{
	public static void main(String[] args) {
		Piece a = Factory.create(Colors.WHITE, King.class);
	}

}
