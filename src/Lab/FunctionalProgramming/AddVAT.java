package Lab.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prices = scanner.nextLine().split(", ");
        // Creating a function to add VAT to the prices
        Function<Double, Double> addVAT = e -> 1.2 * e;

        // Calculating prices and printing them
        System.out.println("Prices with VAT:");
        Arrays.stream(prices).map(e -> Double.parseDouble(e)).map(addVAT).forEach(e -> System.out.printf("%.2f%n", e));
    }
}