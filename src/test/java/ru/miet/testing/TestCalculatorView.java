package ru.miet.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestCalculatorView {
    @Test
    public void test_getFirstArgumentAsString(){
        CalculatorView calcView = new CalculatorView();

        calcView.leftNumber = "15";

        String resFirst = calcView.getFirstArgumentAsString();

        Assertions.assertEquals("15", resFirst);

    }

    @Test
    public void test_getSecondArgumentAsString(){
        CalculatorView calcView = new CalculatorView();

        calcView.rightNumber = "10";

        String resSecond = calcView.getSecondArgumentAsString();

        Assertions.assertEquals("10", resSecond);

    }

    @Test
    public void test_printResult(){
        CalculatorView calcView = new CalculatorView();


        // Создаем поток для перехвата данных из System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;  // Сохраняем оригинальный поток вывода

        try {
            // Перенаправляем System.out на наш ByteArrayOutputStream
            System.setOut(new PrintStream(outputStream));

            // Пишем в System.out
            calcView.printResult(149999);

            // Получаем данные из потока
            String res = outputStream.toString().trim();

            // Проверяем результат
            Assertions.assertEquals("149999.0", res);

        } finally {
            System.setOut(originalOut);

        }
    }

    @Test
    public void test_displayError() {
        CalculatorView calcView = new CalculatorView();

        // Создаем поток для перехвата данных из System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;  // Сохраняем оригинальный поток вывода

        try {
            // Перенаправляем System.out на наш ByteArrayOutputStream
            System.setOut(new PrintStream(outputStream));

            // Пишем в System.out
            calcView.displayError("new error wdwdwdwdw");

            // Получаем данные из потока
            String res = outputStream.toString().trim();

            // Проверяем результат
            Assertions.assertEquals("Error: new error wdwdwdwdw", res);

        } finally {
            System.setOut(originalOut);

        }
    }
}



