package homework21.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageArrayTest {
    @Test
    void averageArrayTest() {
        AverageArrayService averageArray = new AverageArrayService();
        double[] myarray = {5,5,11};
        double expected = 7.0 ;

        double actual = averageArray.myAverage();
        assertEquals(expected,actual);
    }
}