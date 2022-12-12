package ExamPreparationI;

import java.util.*;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBoxQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();

        int loot = 0;

        String input = scanner.nextLine();

        Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).forEach(firstBoxQueue::offer);

        input = scanner.nextLine();

        Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).forEach(secondBoxStack::push);

        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()){

            int firstBoxInt = firstBoxQueue.peek();
            int secondBoxInt = secondBoxStack.pop();

            int sum = firstBoxInt + secondBoxInt;
            if (sum % 2 == 0){

                firstBoxQueue.poll();
                loot += sum;
            } else {

                firstBoxQueue.offer(secondBoxInt);
            }
        }

        if (firstBoxQueue.isEmpty()){
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if(loot >= 100){
            System.out.printf("Your loot was epic! Value: %d", loot);
        } else {
            System.out.printf("Your loot was poor... Value: %d", loot);
        }
    }
}
