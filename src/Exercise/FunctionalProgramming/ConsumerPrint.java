package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        // Creating a consumer
        Consumer<String> consumer = System.out::println;

        // Printing the names
        input.forEach(consumer);

//        for (String name : input) {
//            consumer.accept(name);
//        }
    }
}