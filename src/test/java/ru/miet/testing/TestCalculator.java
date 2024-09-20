package ru.miet.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testAddTwoNumbers() {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 20;

        double res = calc.sum(num1, num2);

        Assertions.assertEquals(30, res);

    }

    @Test
    public void testSubtractTwoNumbers() {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 20;
        double res = calc.subtract(num1, num2);

        Assertions.assertEquals(-10, res);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 20;
        double res = calc.multiply(num1, num2);

        Assertions.assertEquals(200, res);
    }

    @Test
    public void testDivideTwoNumbersPositive() {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 20;
        double res = calc.divide(num1, num2);

        Assertions.assertEquals(0.5, res);
    }

    @Test
    public void testDivideTwoNumbersNegative() {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(num1, num2));


    }
}
