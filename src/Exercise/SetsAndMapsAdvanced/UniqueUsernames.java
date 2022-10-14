package Exercise.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();

            uniqueNames.add(name);
        }

        uniqueNames.forEach(System.out::println);
    }
}