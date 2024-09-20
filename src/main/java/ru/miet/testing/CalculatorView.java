package ru.miet.testing;

import javax.swing.text.View;

public class CalculatorView extends Calculator implements ICalculatorView {

    @Override
    public void printResult(double result) {
        System.out.println(result);
    }

    @Override
    public void displayError(String message) {
        System.out.println("Error: " + message);
    }

    @Override
    public String getFirstArgumentAsString() {
        return this.leftNumber;
    }

    @Override
    public String getSecondArgumentAsString() {
        return this.rightNumber;
    }
}
