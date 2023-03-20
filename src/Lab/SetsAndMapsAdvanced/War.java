package Lab.SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class War {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int draws = 0;
        while (!firstPlayerCards.isEmpty() || !secondPlayerCards.isEmpty()) {

            draws++;

            if (draws == 50) {
                break;
            }

            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);
            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);

            } else if (secondNumber > firstNumber) {
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }

        }
        if (firstPlayerCards.isEmpty()) {
            System.out.println("First player win!");
        } else if (secondPlayerCards.isEmpty()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}