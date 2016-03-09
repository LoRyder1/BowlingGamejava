
public class InterpretFrame {

    private int rolls[] = new int[21];
    private int frameIndex = 0;

    public InterpretFrame(int[] rolls, int frameIndex) {
        this.rolls = rolls;
        this.frameIndex = frameIndex;
    }

    public boolean isStrike() {
        return rolls[frameIndex] == 10;
    }

    public boolean isSpare() {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    public int strikeBonus() {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    public int spareBonus() {
        return rolls[frameIndex + 2];
    }

    public int sumOfAllPinsInFrame() {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
}
