package test;

import main.Game;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {
    @Test
    public void testsGutterGame() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
