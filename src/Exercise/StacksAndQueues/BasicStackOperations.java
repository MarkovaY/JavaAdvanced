package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split("\\s+");

        int numbersToPush = Integer.parseInt(input[0]);
        int numbersToPop = Integer.parseInt(input[1]);
        int checkPresence = Integer.parseInt(input[2]);

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        for (int i = 0; i < numbersToPush; i++) {
            numbersStack.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < numbersToPop; i++) {
            numbersStack.pop();
        }
        if (numbersStack.contains(checkPresence)) {
            System.out.println("true");
        } else if (numbersStack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(numbersStack.stream().min(Integer::compareTo).get());
        }
    }
}