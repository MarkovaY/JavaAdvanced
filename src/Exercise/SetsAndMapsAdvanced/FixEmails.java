package Exercise.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> mailBook = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            String mail = scanner.nextLine();

            if (!mail.contains(".us") && !mail.contains(".uk") && !mail.contains(".com")) {
                mailBook.put(input, mail);
            }

            input = scanner.nextLine();
        }

        for (var entry : mailBook.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}