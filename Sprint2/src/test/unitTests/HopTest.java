package test.unitTests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import production.business.AmericanCheckersGame;
import production.business.CheckersPiece;
import production.gui.AmericanCheckersGUI;


public class HopTest {

    private AmericanCheckersGame game;

    @Before
    public void setUp() throws Exception {
        game = new AmericanCheckersGame();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void BlacktestValidHop() {
        game.makeMove(2,3,4,1);
        Assert.assertTrue("El salto es inválido", game.validMove(5, 0, 3, 2));
    }

    @Test
    public void RedtestValidHop() {
        game.makeMove(5,0,3,2);
        game.changeTurn();
        Assert.assertTrue("El salto es inválido", game.validMove(2, 1, 4, 3));
    }

    @Test
    public void BlacktestInvalidHop() {
        game.makeMove(5,2,4,1);
        Assert.assertFalse("El salto es inválido", game.validMove(5, 0, 3, 2));
    }

    @Test
    public void RedtestInvalidHop() {
        game.makeMove(2,3,3,2);
        Assert.assertFalse("El salto es inválido", game.validMove(2, 1, 4, 3));
    }



}