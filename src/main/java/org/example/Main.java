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

        CalculatorOperation operation = CalculatorOperation.ADDITION;
        Integer result = 0;
        for(int i = 0; i < numbers.size(); i++) {
            switch(operation) {
                case ADDITION:
                    result += numbers.get(i);
                    if(i == 0) {
                        System.out.println(result);
                    } else {
                        System.out.println("+" + numbers.get(i) + " (=" + result + ")");
                    }
                    break;
                case SUBTRACTION:
                    result -= numbers.get(i);
                    if(i == 0) {
                        System.out.println(result);
                    } else {
                        System.out.println("-" + numbers.get(i) + " (=" + result + ")");
                    }
                    break;
                case MULTIPLICATION:
                    result *= numbers.get(i);
                    if(i == 0) {
                        System.out.println(result);
                    } else {
                        System.out.println("*" + numbers.get(i) + " (=" + result + ")");
                    }
                    break;
            }
        }
        System.out.println("--------");
        System.out.println("total: " + result + " (" + operation.toString().toLowerCase() + ")");
    }
}
