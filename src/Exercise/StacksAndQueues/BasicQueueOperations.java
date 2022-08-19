package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split("\\s+");

        int numbersToAdd = Integer.parseInt(input[0]);
        int numbersToPoll = Integer.parseInt(input[1]);
        int checkPresence = Integer.parseInt(input[2]);

        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();
        for (int i = 0; i < numbersToAdd; i++) {
            numbersQueue.offer(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < numbersToPoll; i++) {
            numbersQueue.poll();
        }
        if (numbersQueue.contains(checkPresence)) {
            System.out.println("true");
        } else if (numbersQueue.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(numbersQueue));
        }
    }
}