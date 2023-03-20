package examRetake;


import java.util.*;

public class climbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> foodPortion = new ArrayDeque<>();
        ArrayDeque<Integer> staminaQuantity = new ArrayDeque<>();
        List<String> peaksClimbed = new ArrayList<>();

        String inputPortions = scanner.nextLine();

        Arrays.stream(inputPortions.split(",\\s+")).mapToInt(Integer::parseInt).forEach(foodPortion::push);

        String inputStamina = scanner.nextLine();

        Arrays.stream(inputStamina.split(",\\s+")).mapToInt(Integer::parseInt).forEach(staminaQuantity::offer);

        String[] allPeaks = {"Vihren, 80", "Kutelo, 90", "Banski Suhodol, 100", "Polezhan, 60", "Kamenitza, 70"};

        int daysFailed = 0;

        boolean hasSucceeded = true;
        for (int j = 0; j < allPeaks.length; j++) {

            String[] currentPeak = allPeaks[j].split(", ");
            String peakName = currentPeak[0];
            int peakDifficulty = Integer.parseInt(currentPeak[1]);
            int dailyFood = foodPortion.pop();
            int dailyStamina = staminaQuantity.poll();
            int dailySum = dailyFood + dailyStamina;

            if (dailySum >= peakDifficulty) {
                peaksClimbed.add(peakName);
            } else {
                daysFailed++;
                j -= 1;

                if (daysFailed > 2 ) {
                    hasSucceeded = false;
                    break;
                }
            }
        }

        if (!hasSucceeded) {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        } else {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        }

        if (!peaksClimbed.isEmpty()) {
            System.out.println("Conquered peaks:");
            peaksClimbed.forEach(System.out::println);
        }
    }
}