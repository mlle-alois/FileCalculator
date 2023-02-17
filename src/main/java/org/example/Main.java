package org.example;

import java.util.List;

enum CalculatorOperation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION
}
public class Main {
    public static void main(String[] args) {
        NumberFileReader fileReader = new NumberFileReader();
        List<Integer> numbers = fileReader.readNumbersFile("numbers.txt");

        CalculatorOperation operation = CalculatorOperation.SUBTRACTION;
        Calculator calculator = new Calculator();
        String result = calculator.calculate(numbers, operation);
        System.out.println(result);

    }
}
