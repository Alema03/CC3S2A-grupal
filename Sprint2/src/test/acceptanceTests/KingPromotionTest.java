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
        game.makeMove(5,0,0,5);
        Assert.assertTrue("La evolucion a Rey no tuvo éxito", game.getCheckersPiece(0, 5).isKing()); // king promotion
    }

    @Test
    public void testUnSuccessfulKingPromotion() {
        game.makeMove(5,0,1,5);
        Assert.assertFalse("Promoción de rey fallida", game.getCheckersPiece(1, 5).isKing()); // king promotion
    }




}
