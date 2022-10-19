package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        // Reading the dividing number
        int divider = Integer.parseInt(scanner.nextLine());

        // Reverse the collection
        Collections.reverse(numbersList);
        // Remove numbers which are divisible by the divider
        numbersList.removeIf(number -> number % divider == 0);
        // Print the collection
        numbersList.forEach(e -> System.out.print(e + " "));
    }
}