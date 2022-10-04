package Lab.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;


public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        List<String> evenNumbers = Arrays.stream(numbers).map(Integer::parseInt).filter(e -> e % 2 == 0).map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));
        evenNumbers = evenNumbers.stream().map(Integer::parseInt).sorted(Integer::compareTo).map(Object::toString).collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));
    }
}