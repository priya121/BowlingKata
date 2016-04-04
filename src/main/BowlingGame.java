package main;

public class BowlingGame {
    private int[] knockedPins = new int[22];
    private int counter = 0;

    public void roll(int pins) {
        knockedPins[counter++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (knockedPins[frameIndex] == 10) {
                score += 10 + knockedPins[frameIndex + 1] + knockedPins[frameIndex + 2];
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + knockedPins[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += knockedPins[frameIndex] + knockedPins[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int i) {
        return knockedPins[i] + knockedPins[i + 1] == 10;
    }
}
