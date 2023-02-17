package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberFileReader fileReader = new NumberFileReader();
        List<Integer> numbers = fileReader.readNumbersFile("numbers.txt");
        System.out.println(numbers);
    }
}
