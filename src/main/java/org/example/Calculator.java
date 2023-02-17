package org.example;

import java.util.List;

public class Calculator {

    public String calculate(List<Integer> numbers, CalculatorOperation operation) {
        Integer result = 0;
        String operationSing = "+";
        StringBuilder resultString = new StringBuilder();
        for(int i = 0; i < numbers.size(); i++) {
            switch (operation) {
                case ADDITION -> {
                    result += numbers.get(i);
                    operationSing = "+";
                }
                case SUBTRACTION -> {
                    result -= numbers.get(i);
                    operationSing = "-";
                }
                case MULTIPLICATION -> {
                    result *= numbers.get(i);
                    operationSing = "*";
                }
            }
            if(i == 0) {
                resultString.append(result + "\n");
            } else {
                resultString.append(operationSing).append(numbers.get(i)).append(" (=").append(result).append(")" + "\n");
            }
        }
        resultString.append("--------" + "\n");
        resultString.append("total: ").append(result).append(" (").append(operation.toString().toLowerCase()).append(")" + "\n");
        return resultString.toString();
    }
}
