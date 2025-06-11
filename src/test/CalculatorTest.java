package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum() {
        Calculator calculator = new Calculator();

        // исходные данные
        int x = 10;
        int y = 15;

        // ожидаемый результат
        int expectedResult = 25;

        // реальный результат (результат работы метода)

        int actualResult = calculator.sum(x, y);

        // используем стандартный метод JUnit

        assertEquals(expectedResult, actualResult);
    }

}