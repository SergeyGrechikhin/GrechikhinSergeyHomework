package homework21.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageArrayTest {
    @Test
    void averageArrayTest() {
        AverageArrayService averageArray = new AverageArrayService();
        int[] myarray = {5,5,10};
        double expected = 6.0 ;

        double actual = averageArray.myAverage();
        assertEquals(expected,actual);
    }
}