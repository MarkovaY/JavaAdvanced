package Exercise.DefiningClasses.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> fragileCars = new LinkedHashMap<>();
        Map<String, Car> flamableCars = new LinkedHashMap<>();
        List<Tyre> tyres = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {

            String[] carInfo = scanner.nextLine().split("\\s+");

            String model = carInfo[0];
            int speed = Integer.parseInt(carInfo[1]);
            int power = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];

            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tyre tyre = null;

            for (int j = 5; j <= 12; j += 2) {
                addingTyreInformation(tyres, carInfo, j);
            }

            Car car = new Car(engine, cargo, tyres);

            if (cargoType.equals("fragile")) {
                for (Tyre element : tyres) {
                    if (element.getPressure() < 1) {
                        fragileCars.put(model, car);
                    }
                }
            } else if (cargoType.equals("flamable")) {
                if (power > 250) {
                    flamableCars.put(model, car);
                }
            }

        }

        String command = scanner.nextLine();
        printingFragileOrFlamableCars(fragileCars, flamableCars, command);
    }

    private static void printingFragileOrFlamableCars(Map<String, Car> fragileCars, Map<String, Car> flamableCars, String command) {
        switch (command) {
            case "fragile":
                fragileCars.keySet().forEach(System.out::println);
                break;
            case "flamable":
                flamableCars.keySet().forEach(System.out::println);
                break;
        }
    }

    private static void addingTyreInformation(List<Tyre> tyres, String[] carInfo, int j) {
        Tyre tyre;
        double tyrePressure = Double.parseDouble(carInfo[j]);
        int tyreAge = Integer.parseInt(carInfo[j + 1]);
        tyre = new Tyre(tyrePressure, tyreAge);
        tyres.add(tyre);
    }
}