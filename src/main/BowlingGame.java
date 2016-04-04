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
            if (isStrike(frameIndex)) {
                score += strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += normalScore(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int normalScore(int frameIndex) {
        return knockedPins[frameIndex] + knockedPins[frameIndex + 1];
    }

    private int spareBonus(int frameIndex) {
        return 10 + knockedPins[frameIndex + 2];
    }

    private int strikeBonus(int frameIndex) {
        return 10 + knockedPins[frameIndex + 1] + knockedPins[frameIndex + 2];
    }

    private boolean isSpare(int i) {
        return normalScore(i) == 10;
    }

    private boolean isStrike(int i) {
        return knockedPins[i] == 10;

    }
}
