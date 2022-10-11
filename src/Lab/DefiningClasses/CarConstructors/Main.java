package Lab.DefiningClasses.CarConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of cars
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] cars = scanner.nextLine().split("\\s+");
            // Creating new Cars by using class Car
            Car car = cars.length == 1 ? new Car(cars[0]) : new Car(cars[0], cars[1], Integer.parseInt(cars[2]));

            // Printing the cars
            System.out.println(car);
        }
    }
}