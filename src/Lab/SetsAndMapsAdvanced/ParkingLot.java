package Lab.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> carsInTheParking = new LinkedHashSet<>();
        while (!input.equals("END")) {

            String direction = input.split(", ")[0];
            String plateNumber = input.split(", ")[1];

            if (direction.equals("IN")) {
                carsInTheParking.add(plateNumber);
            } else {
                carsInTheParking.remove(plateNumber);
            }

            input = scanner.nextLine();
        }
        if (carsInTheParking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String plateNumber : carsInTheParking) {
                System.out.println(plateNumber);
            }
        }
    }
}