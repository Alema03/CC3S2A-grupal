package test.acceptanceTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;

public class KingPromotionTest {

    private AmericanCheckersGame game;

    @Before
    public void setUp() throws Exception {
        game = new AmericanCheckersGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSuccessfulKingPromotion() {
        // Verifica si una pieza se convierte en rey después de un movimiento válido
        game.makeMove(5,0,0,5);
        Assert.assertTrue("La promoción a rey fue exitosa", game.getCheckersPiece(0, 5).isKing());
    }

    @Test
    public void testUnSuccessfulKingPromotion() {
        // Verifica si la promoción a rey no ocurre cuando el movimiento no llega al final del tablero
        game.makeMove(5,0,1,5);
        Assert.assertFalse("La promoción a rey no ocurrió", game.getCheckersPiece(1, 5).isKing());
    }
}


