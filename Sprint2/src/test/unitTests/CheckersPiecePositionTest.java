package test.unitTests;

import junit.framework.TestCase;
import production.business.CheckersPiece;

public class CheckersPiecePositionTest extends TestCase {
    public void testCheckersPieceColor() {
        CheckersPiece piece = new CheckersPiece("RED");
        // Verifica que el color de la pieza de damas sea rojo
        assertEquals("El color de la pieza de damas debería ser rojo", piece.getColor(), "RED");
        // Cambia el color de la pieza a negro
        piece.setColor("BLACK");
        // Verifica que el color de la pieza de damas sea negro
        assertEquals("El color de la pieza de damas debería ser negro", piece.getColor(), "BLACK");
    }

    public void testCheckersKingPiece() {
        CheckersPiece piece = new CheckersPiece("RED");
        // Verifica que la pieza de damas no sea un rey inicialmente
        assertEquals("La pieza de damas no debería ser rey", piece.isKing(), false);
        // Configura la pieza como rey
        piece.setKing();
        // Verifica que la pieza de damas ahora sea un rey
        assertEquals("La pieza de damas debería ser rey", piece.isKing(), true);
    }
}
