package Exercise.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading how many entries we'll get
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            // Reading names
            String name = scanner.nextLine();

            //Adding names to the set
            uniqueNames.add(name);
        }

        // Printing all the entries of the set
        uniqueNames.forEach(System.out::println);
    }
}