import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTest {

    private Game g;

    private void rollMany(int n, int pins) {
        for(int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void testGutterGame() {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

//    @Test
//    public void testOneSpare() {
//        g.roll(5);
//        g.roll(5);
//        g.roll(3);
//        rollMany(17,0);
//        assertEquals(16, g.score());
//    }
}
