
public class Game {

    private int rolls[] = new int [21];
    private int currentRoll = 0;
    private int score = 0;
    private int frameIndex = 0;
    private InterpretFrame frame;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        for (int frame = 0; frame < 10; frame++) {
            scoreFrame();
        }
        return score;
    }

    private void scoreFrame() {
        frame = new InterpretFrame(rolls, frameIndex);
        if (frame.isStrike()) {
            score += 10 + frame.strikeBonus();
            frameIndex++;
        }
        else if (frame.isSpare()) {
            score += 10 + frame.spareBonus();
            frameIndex += 2;
        } else {
            score += frame.sumOfAllPinsInFrame();
            frameIndex += 2;
        }
    }
}

