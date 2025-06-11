package homework21.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EvenArrayTest {
    @Test
    void evenArrayTest() {
        EvenArrayService myevenArrayService = new EvenArrayService();
        int[] expected = {2, 4, 6, 8, 10};
        int[] actual = myevenArrayService.myEvenArray();
        assertArrayEquals(expected, actual);

    }
  
}