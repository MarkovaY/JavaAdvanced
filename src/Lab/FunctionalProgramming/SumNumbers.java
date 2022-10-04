package Lab.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersInput = scanner.nextLine().split(", ");

        // Parsing Strings to Integers using a function
        Function<String, Integer> functionParse = e -> Integer.parseInt(e);
        List<Integer> numbers = Arrays.stream(numbersInput).map(functionParse).collect(Collectors.toList());

        // Finding the sum of all the integers from the input
        int sum = Arrays.stream(numbersInput).mapToInt(Integer::parseInt).sum();
        // Printing the count of the elements
        System.out.println("Count = " + numbers.size());
        // Printing the sum of the elements
        System.out.print("Sum = " + sum);
    }
}