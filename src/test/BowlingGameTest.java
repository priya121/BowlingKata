package test;

import main.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {
    BowlingGame game = new BowlingGame();

    @Before
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    public void gutterGameScoreOfZero() {
        multipleRolls(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void onePinKnockedDownEveryRoll() {
        multipleRolls(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void scoresASpare() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        multipleRolls(17, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void scoresAStrike() {
        game.roll(10);
        game.roll(5);
        game.roll(3);
        multipleRolls(17, 0);
        assertEquals(26, game.score());
    }

    public void multipleRolls(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }

    }

}
