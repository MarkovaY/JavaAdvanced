package Exercise.SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        String input = scanner.nextLine();

        // Creating the phonebook map
        Map<String, String> phonebook = new HashMap<>();

        // Filling the phonebook with names and phone numbers
        while (!input.equals("search")) {

            // Getting the name and number from the input
            String name = input.split("-")[0];
            String number = input.split("-")[1];

            phonebook.put(name, number);

            input = scanner.nextLine();
        }

        // Searching the phonebook for the names and numbers required
        while (!input.equals("stop")) {

            // Printing the output
            if (phonebook.containsKey(input)) {
                System.out.println(input + " -> " + phonebook.get(input));
            } else {
                if (!input.equals("search")) {
                    System.out.printf("Contact %s does not exist.%n", input);
                }
            }

            input = scanner.nextLine();
        }
    }
}