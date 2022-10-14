package Exercise.SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the text we need to count the symbols in
        String text = scanner.nextLine();

        // Creating a map to keep the counted letters
        Map<Character, Integer> countLetters = new TreeMap<>();

        // Iterating through the text and extracting letters
        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);

            // Adding letters and their count in the map
            if (!countLetters.containsKey(letter)) {
                countLetters.put(letter, 1);
            } else {
                int counter = countLetters.get(letter);
                countLetters.put(letter, counter + 1);
            }
        }
        // Printing the letters count
        for (var entry : countLetters.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}