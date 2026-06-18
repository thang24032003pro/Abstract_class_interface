package Tach_bien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    @DisplayName("Testing number divisible by 3")
    void testFizz() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing number divisible by 5")
    void testBuzz() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing number divisible by both 3 and 5")
    void testFizzBuzz() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing number not divisible by 3 or 5")
    void testNumber() {
        int number = 2;
        String expected = "2";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}
