package Lab.DefiningClasses.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Car car = new Car();
        for (int i = 0; i < n; i++) {
            String[] cars = scanner.nextLine().split("\\s+");
            car.setBrand(cars[0]);
            car.setModel(cars[1]);
            car.setHorsePower(Integer.parseInt(cars[2]));

            System.out.println(car);
        }
    }
}