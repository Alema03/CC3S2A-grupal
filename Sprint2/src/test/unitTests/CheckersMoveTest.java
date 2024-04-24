package test.unitTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;

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
        // Verifica que el primer turno lo juegue el equipo negro
        assertEquals("El primer turno debería ser jugado por el equipo negro", "BLACK", game.getTurn());

        // Verifica si el primer movimiento es válido para las piezas negras
        assertTrue("El primer movimiento debería ser por el equipo negro", game.validMove(5,0,4,1));
        assertTrue("El primer movimiento debería ser por el equipo negro", game.validMove(5,2,4,3));
    }

    @Test
    public void testFirstMoveByRed() {
        // Verifica que el primer turno no lo juegue el equipo rojo
        assertNotSame("El primer turno debería ser jugado por el equipo negro", "RED", game.getTurn());

        // Verifica que el primer movimiento para las piezas rojas no sea válido
        assertFalse("El primer movimiento debería ser por el equipo negro", game.validMove(2,1,3,0));
        assertFalse("El primer movimiento debería ser por el equipo negro", game.validMove(2,3,3,3));
    }
}
