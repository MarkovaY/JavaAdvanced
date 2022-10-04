package Lab.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating consumer - printer
        Consumer<String> printer = System.out::println;

        // Creating a predicate to filter the upper case words
        Predicate<String> upperCasePredicate = word -> Character.isUpperCase(word.charAt(0));

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("//s+")).filter(upperCasePredicate).toList();

        // Print upper case words count
        System.out.println(upperCaseWords.size());

        // Print all upper case words
        upperCaseWords.forEach(printer);
    }
}