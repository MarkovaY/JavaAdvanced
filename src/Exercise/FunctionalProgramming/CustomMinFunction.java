package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Finding the minimum value in the array using a function
        Function<int[], Integer> minIntFunction = arr -> {
            int min = Integer.MAX_VALUE;
            for (int number : arr) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };

        // Another option, but possible exception
        // Function<int[], Integer> minIntFunction = numbersArr -> Arrays.stream(numbersArr).min().getAsInt();
        int min = minIntFunction.apply(numbers);
        System.out.print(min);
    }
}