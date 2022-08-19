package Exercise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String commands = scanner.nextLine();
            String command = commands.split(" ")[0];

            switch (command) {
                case "1":
                    int element = Integer.parseInt(commands.split(" ")[1]);
                    numbersStack.push(element);
                    break;
                case "2":
                    numbersStack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(numbersStack));
                    break;
            }
        }
    }
}