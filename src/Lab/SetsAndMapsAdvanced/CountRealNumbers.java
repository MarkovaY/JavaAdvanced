package Lab.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> realNumbersMap = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).forEach(key -> {
            if (realNumbersMap.containsKey(key)) {
                int value = realNumbersMap.get(key);
                value += 1;
                realNumbersMap.put(key, value);
            } else {
                realNumbersMap.put(key, 1);
            }
        });

        for (var entry : realNumbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}