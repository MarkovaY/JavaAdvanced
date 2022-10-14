package Exercise.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of chemical compounds
        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            // Reading the lines with elements
            String[] compound = scanner.nextLine().split("\\s+");

            // Add elements to the set
            elements.addAll(Arrays.asList(compound));
        }

        // Print elements
        elements.forEach(e -> System.out.print(e + " "));
    }
}