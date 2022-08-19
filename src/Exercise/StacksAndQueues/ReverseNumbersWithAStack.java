package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> reverseStack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            reverseStack.push(input[i]);
        }
        reverseStack.forEach(number -> System.out.print(number + " "));
    }
}