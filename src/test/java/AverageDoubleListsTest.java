import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {
    AverageDoubleLists davg = new AverageDoubleLists();

    @Test
    void count() {
        ArrayList<Double> aa = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        double expected = 3.0;

        assertEquals(expected, davg.count(aa));
    }

    @Test
    void sum() {
        ArrayList<Double> aa = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        double expected = 6.0;

        assertEquals(expected, davg.sum(aa));
    }

    @Test
    void average() {
        ArrayList<Double> aa = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        double expected = 2.0;

        assertEquals(expected, davg.average(aa));
    }
}