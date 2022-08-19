package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();

        if (number == 0) {
            System.out.print(0);
        }
        while (number != 0) {

            int leftover = number % 2;
            binaryStack.push(leftover);
            number = number / 2;
        }
        for (Integer integer : binaryStack) {
            System.out.print(integer);
        }
    }
}