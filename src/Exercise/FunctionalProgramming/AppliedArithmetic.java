package Exercise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        UnaryOperator<List<Integer>> add = numbers -> numbers.stream().map(number -> number + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = numbers -> numbers.stream().map(number -> number * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = numbers -> numbers.stream().map(number -> number - 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = numbers -> numbers.forEach(number -> System.out.print(number + " "));
        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numbersList = add.apply(numbersList);
                    break;
                case "multiply":
                    numbersList = multiply.apply(numbersList);
                    break;
                case "subtract":
                    numbersList = subtract.apply(numbersList);
                    break;
                case "print":
                    print.accept(numbersList);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

//        numbersList.forEach(n -> System.out.print(n + " "));
    }
}