package test.unitTests;

import junit.framework.TestCase;
import production.business.CheckersPiece;

public class CheckersPiecePositionTest extends TestCase {
    public void testCheckersPieceColor() {
        CheckersPiece piece = new CheckersPiece("RED");
        assertEquals("El color de la pieza de damas debe ser rojo.", piece.getColor(), "RED");
        piece.setColor("BLACK");
        assertEquals("El color de la pieza de damas debe ser negro.", piece.getColor(), "BLACK");
    }

    public void testCheckersKingPiece() {
        CheckersPiece piece = new CheckersPiece("RED");
        assertEquals("El color de la pieza de damas no debería ser el rey.", piece.isKing(), false);
        piece.setKing();
        assertEquals("El color de la pieza de damas debe ser el rey.", piece.isKing(), true);
    }
}
