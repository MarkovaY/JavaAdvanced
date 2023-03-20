package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading the input
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // A function which finds the smallest int in the list
        Function<List<Integer>, Integer> findSmallestInt = list -> {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= min) {
                    min = list.get(i);
                    index = i;
                }
            }
            return index;
        };

        System.out.println(findSmallestInt.apply(numbers));
    }
}