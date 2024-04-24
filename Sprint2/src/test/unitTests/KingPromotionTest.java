package test.unitTests;

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
    public void testBlackSuccessfulKingPromotion() {
        // Realiza un movimiento que lleva a la promoción de una pieza negra a rey
        game.makeMove(5,0,0,5);
        // Verifica que la pieza negra en la posición (0, 5) es ahora un rey
        Assert.assertTrue("La promoción a rey fue fallida", game.getCheckersPiece(0, 5).isKing());
    }

    @Test
    public void testRedSuccessfulKingPromotion() {
        // Realiza un movimiento que lleva a la promoción de una pieza roja a rey
        game.makeMove(0,1,7,2);
        // Verifica que la pieza roja en la posición (7, 2) es ahora un rey
        Assert.assertTrue("La promoción a rey fue fallida", game.getCheckersPiece(7, 2).isKing());
    }

    @Test
    public void testRedUnSuccessfulKingPromotion() {
        // Realiza un movimiento que no debería llevar a la promoción a rey
        game.makeMove(0,1,4,1);
        // Verifica que la pieza roja en la posición (4, 1) no es un rey
        Assert.assertFalse("La promoción a rey no debería ser exitosa", game.getCheckersPiece(4, 1).isKing());
    }

    @Test
    public void testBlackUnSuccessfulKingPromotion() {
        // Realiza un movimiento que no debería llevar a la promoción a rey
        game.makeMove(5,0,1,5);
        // Verifica que la pieza negra en la posición (1, 5) no es un rey
        Assert.assertFalse("La promoción a rey no debería ser exitosa", game.getCheckersPiece(1, 5).isKing());
    }

}
