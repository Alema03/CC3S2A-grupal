package test.acceptanceTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;

public class HopTest extends TestCase {

    private AmericanCheckersGame game;

    @Before
    public void setUp() throws Exception {
        game = new AmericanCheckersGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testValidHop() {
        // Verifica un salto válido en el juego
        game.makeMove(2,3,4,1);
        assertTrue("El salto es válido", game.validMove(5,0,3,2));
    }

    @Test
    public void testInvalidHop() {
        // Verifica un salto inválido en el juego
        game.makeMove(5,2,4,1);
        assertFalse("El salto es inválido", game.validMove(5,0,3,2));
    }
}
