package main;

public class BowlingGame {
    private int[] knockedPins = new int[22];
    private int counter = 0;

    public void roll(int pins) {
        knockedPins[counter++] = pins;
    }

    public int score() {
        int score = 0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (knockedPins[i] + knockedPins[i + 1] == 10)
            {
                score += 10 + knockedPins[i + 2];
                i += 2;
            } else {
                score += knockedPins[i] + knockedPins[i + 1];
                i += 2;
            }
        }
        return score;
    }
}
