package test;

import main.BowlingGame;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {
    @Test
    public void testsGutterGame() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
