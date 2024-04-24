package test.acceptanceTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;

public class CheckersMoveTest extends TestCase {

    private AmericanCheckersGame game;

    @Before
    public void setUp() throws Exception {
        game = new AmericanCheckersGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFirstMoveByBlack() {
        assertEquals("El primer turno debería ser jugado por las fichas negras", "BLACK", game.getTurn());

        assertTrue("El primer movimiento debería ser por las fichas negras", game.validMove(5, 0, 4, 1));
    }

    @Test
    public void testFirstMoveByRed() {
        assertNotSame("El primer turno debería ser jugado por las fichas negras", "RED", game.getTurn());

        assertFalse("El primer movimiento debería ser por las fichas negras", game.validMove(2, 1, 3, 0));
    }

    @Test
    public void testValidMove() {
        assertTrue("El movimiento es inválido", game.validMove(5, 0, 4, 1));
    }

    @Test
    public void testInvalidMove() {
        assertFalse("El movimiento es inválido", game.validMove(5, 0, 3, 2));
    }

    @Test
    public void testValidMoveByKing() {
        game.makeMove(5, 0, 0, 5); // Jugada que convierte una ficha en rey
        assertTrue(game.getCheckersPiece(0, 5).isKing()); // Promoción a rey
        game.makeMove(1, 4, 3, 2);

        assertTrue("El movimiento por el rey negro debería ser válido", game.validMove(0, 5, 1, 4));
    }

    @Test
    public void testInvalidMoveByKing() {
        game.makeMove(5, 0, 0, 5);

        game.makeMove(1, 4, 3, 2);

        assertFalse("El movimiento por el rey negro no debería ser válido", game.validMove(0, 5, 2, 3));
    }

}
