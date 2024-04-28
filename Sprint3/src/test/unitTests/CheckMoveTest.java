package test.unitTests;

    import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;

public class CheckMoveTest extends TestCase {

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

        assertEquals("El primer turno lo deben jugar las negras.", "BLACK", game.getTurn());

        assertTrue("El primer movimiento debería ser de las negras.", game.validMove(5,0,4,1));
        assertTrue("El primer movimiento debería ser de las negras.", game.validMove(5,2,4,3));
    }

    @Test
    public void testFirstMoveByRed() {

        assertNotSame("El primer turno lo deben jugar las negras.", "RED", game.getTurn());

        assertFalse("El primer movimiento debería ser de las negras.", game.validMove(2,1,3,0));
        assertFalse("El primer movimiento debería ser de las negras.", game.validMove(2,3,3,3));
    }
}
