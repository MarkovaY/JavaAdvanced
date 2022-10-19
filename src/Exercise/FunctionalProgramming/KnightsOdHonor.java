package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOdHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        // Creating a consumer which adds Sir to the names
        Consumer<String> consumer = e -> System.out.println("Sir " + e);

        // Printing the names
        input.forEach(consumer);
    }
}