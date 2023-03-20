package Lab.FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> nameAndAge = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] person = scanner.nextLine().split(", ");
            String name = person[0];
            int age = Integer.parseInt(person[1]);

            nameAndAge.put(name, age);
        }

        String comparison = scanner.nextLine();
        int ageComparison = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        // Filter people by age limit
        BiPredicate<Integer, Integer> filterPredicate = null;
        if (comparison.equals("younger")) {
            filterPredicate = (age, ageLimit) -> age <= ageComparison;
        } else if (comparison.equals("older")) {
            filterPredicate = (age, ageLimit) -> age >= ageComparison;
        }
        // Create filter according to printType
        Consumer<Map.Entry<String, Integer>> printConsumer = null;
        if (printType.equals("name age")) {
            printConsumer = name -> System.out.println(name.getKey() + " - " + name.getValue());
        } else if (printType.equals("name")) {
            printConsumer = name -> System.out.println(name.getKey());
        } else if (printType.equals("age")) {
            printConsumer = name -> System.out.println(name.getValue());
        }

        if (printConsumer != null) {
            BiPredicate<Integer, Integer> finalFilterPredicate = filterPredicate;
            nameAndAge.entrySet().stream().filter(name -> {
                if (finalFilterPredicate != null) {
                    return finalFilterPredicate.test(name.getValue(), ageComparison);
                }
                return false;
            }).forEach(printConsumer);
        }
    }
}