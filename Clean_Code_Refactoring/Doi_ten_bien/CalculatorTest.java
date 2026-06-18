package Doi_ten_bien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Testing add with positive numbers")
    void testAdd() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expected = 8;

        int result = Calculator.add(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtract with positive numbers")
    void testSubtract() {
        int firstNumber = 10;
        int secondNumber = 4;
        int expected = 6;

        int result = Calculator.subtract(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiply with positive numbers")
    void testMultiply() {
        int firstNumber = 3;
        int secondNumber = 4;
        int expected = 12;

        int result = Calculator.multiply(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing divide with positive numbers")
    void testDivide() {
        int dividend = 10;
        int divisor = 4;
        double expected = 2.5;

        double result = Calculator.divide(dividend, divisor);
        assertEquals(expected, result);
    }
}
