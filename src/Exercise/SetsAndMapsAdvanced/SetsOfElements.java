package Exercise.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] setLengths = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Defining the lengths of the two sets needed
        int setNSize = setLengths[0];
        int setMSize = setLengths[1];

        LinkedHashSet<Integer> setN = new LinkedHashSet<>();
        LinkedHashSet<Integer> setM = new LinkedHashSet<>();

        // Filling the sets
        for (int i = 0; i < setNSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            setN.add(number);
        }

        for (int i = 0; i < setMSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            setM.add(number);
        }

        // Printing only the repeating elements
        setN.retainAll(setM);
        setN.forEach(e -> System.out.print(e + " "));
    }
}