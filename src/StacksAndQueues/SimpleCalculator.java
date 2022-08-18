package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> inputStack = new ArrayDeque<>();

        int sum = 0;
        Collections.addAll(inputStack, input);

        while (inputStack.size() > 1) {

            int number1 = Integer.parseInt(inputStack.pop());
            String sign = inputStack.pop();
            int number2 = Integer.parseInt(inputStack.pop());

            if (sign.equals("+")) {
                sum = number1 + number2;
                inputStack.push(String.valueOf(sum));
            } else if (sign.equals("-")) {
                sum = number1 - number2;
                inputStack.push(String.valueOf(sum));
            }
        }
        System.out.println(sum);
    }
}