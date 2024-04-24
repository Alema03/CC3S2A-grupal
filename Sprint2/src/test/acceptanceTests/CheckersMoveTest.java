package test.acceptanceTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;

public class CheckersMoveTest extends TestCase {

    private AmericanCheckersGame juego;

    // Método que se ejecuta antes de cada prueba para preparar el entorno
    @Before
    public void setUp() throws Exception {
        juego = new AmericanCheckersGame();
    }

    // Método que se ejecuta después de cada prueba para limpiar el entorno
    @After
    public void tearDown() throws Exception {
    }

    // Prueba para asegurar que el primer movimiento sea realizado por el equipo negro
    @Test
    public void testFirstMoveByBlack() {
        assertEquals("El primer turno debería ser jugado por el equipo negro", "BLACK", juego.getTurn());

        assertTrue("El primer movimiento debería ser realizado por el equipo negro", juego.validMove(5, 0, 4, 1));
    }

    // Prueba para asegurar que el primer movimiento no sea realizado por el equipo rojo
    @Test
    public void testFirstMoveByRed() {
        assertNotSame("El primer turno no debería ser jugado por el equipo rojo", "RED", juego.getTurn());

        assertFalse("El primer movimiento no debería ser realizado por el equipo rojo", juego.validMove(2, 1, 3, 0));
    }

    // Prueba para un movimiento válido
    @Test
    public void testValidMove() {
        assertTrue("El movimiento es inválido", juego.validMove(5, 0, 4, 1));
    }

    // Prueba para un movimiento inválido
    @Test
    public void testInvalidMove() {
        assertFalse("El movimiento es inválido", juego.validMove(5, 0, 3, 2));
    }

    // Prueba para un movimiento válido por parte de un rey
    @Test
    public void testValidMoveByKing() {
        juego.makeMove(5, 0, 0, 5); // Hacer un movimiento que promueva a un rey
        assertTrue(juego.getCheckersPiece(0, 5).isKing()); // Comprobar que ahora es rey
        juego.makeMove(1, 4, 3, 2); // Otro movimiento

        assertTrue("El movimiento por parte del rey negro debería ser válido", juego.validMove(0, 5, 1, 4));
    }

    // Prueba para un movimiento inválido por parte de un rey
    @Test
    public void testInValidMoveByKing() {
        juego.makeMove(5, 0, 0, 5); // Hacer un movimiento que promueva a un rey

        juego.makeMove(1, 4, 3, 2); // Otro movimiento

        assertFalse("El movimiento por parte del rey negro debería ser válido", juego.validMove(0, 5, 2, 3)); // Comprobar movimiento inválido
    }
}

