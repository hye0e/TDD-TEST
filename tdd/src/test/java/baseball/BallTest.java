package test.java.baseball;

import static org.junit.Assert.assertThat;

import main.Ball;
import main.BallStatus;
import org.junit.Test;

public class BallTest {
    @Test
    void nothing() {
        Ball com = new Ball(1, 4);
        // input 과 output
        assertThat(com.play(new Ball(2, 5))).isEqualTo(BallStatus.NOTHING);
    }
}
