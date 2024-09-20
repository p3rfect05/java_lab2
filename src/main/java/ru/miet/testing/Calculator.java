package ru.miet.testing;

public class Calculator implements ICalculator {
    public String leftNumber;
    public String rightNumber;
    public String operation;


    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (Math.abs(b) < Math.pow(10, -8)) {
            throw new ArithmeticException("|b| < 10**-8");
        }
        return a / b;
    }
}
