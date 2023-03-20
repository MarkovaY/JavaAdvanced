package Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mgCaffeine = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] energyDrinks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int caffeineDrank = 0;

        ArrayDeque<Integer> milligramsOfCaffeine = new ArrayDeque<>();
        ArrayDeque<Integer> drinks = new ArrayDeque<>();

        for (int i = 0; i < mgCaffeine.length; i++) {
            milligramsOfCaffeine.push(mgCaffeine[i]);
        }

        for (int i = 0; i < energyDrinks.length; i++) {
            drinks.offer(energyDrinks[i]);
        }

        while (!milligramsOfCaffeine.isEmpty() && !drinks.isEmpty()) {

            int currentCaffeine = milligramsOfCaffeine.pop();
            int currentDrink = drinks.poll();
            int caffeineInDrink = currentCaffeine * currentDrink;
            if ((caffeineInDrink + caffeineDrank) <= 300) {
                caffeineDrank += caffeineInDrink;
            } else {
                drinks.offer(currentDrink);

                if (caffeineDrank - 30 <= 0) {
                    caffeineDrank = 0;
                } else {
                    caffeineDrank -= 30;
                }
            }
        }
        if (!drinks.isEmpty()) {
            System.out.print("Drinks left: ");

            for (int i = 0; i < drinks.size() - 1; i++) {
                System.out.printf("%d, ", drinks.poll());
            }

            System.out.println(drinks.getLast());
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", caffeineDrank);
    }
}