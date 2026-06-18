package Doi_ten_bien;

public class Calculator {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) dividend / divisor;
    }
}
