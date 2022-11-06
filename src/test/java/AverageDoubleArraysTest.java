import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {
    AverageDoubleArrays avg = new AverageDoubleArrays();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double[] aa = {2.0, 3.0, 4.0, 5.0, 6.0};
        int expected = 5;
        assertEquals(expected, avg.count(aa));
    }

    @Test
    void sum() {
        double[] aa = {2.0, 3.0, 4.0, 5.0, 6.0};
        double expected = 20.0;
        assertEquals(expected, avg.sum(aa));
    }

    @Test
    void average() {
        double[] aa = {2.0, 3.0, 4.0, 5.0, 6.0};
        double expected = 4.0;
        assertEquals(expected, avg.average(aa));
    }
}