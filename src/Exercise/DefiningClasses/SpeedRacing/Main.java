package Exercise.DefiningClasses.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String modelCar = input[0];
            double StartFuelAmount = Double.parseDouble(input[1]);
            double amountPerKM = Double.parseDouble(input[2]);

            Car car = new Car(modelCar, StartFuelAmount, amountPerKM);
            cars.put(modelCar, car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String model = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car carToDrive = cars.get(model);
            carToDrive.drive(kmToDrive);

            command = scanner.nextLine();
        }
        cars.values().forEach(System.out::println);
    }
}