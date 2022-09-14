package Lab.SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEntries = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continentsMap = new LinkedHashMap<>();

        for (int entry = 0; entry < countEntries; entry++) {
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            if (!continentsMap.containsKey(continent)) {
                Map<String, List<String>> countriesMap = new LinkedHashMap<>();
                List<String> cities = new ArrayList<>();
                cities.add(city);
                countriesMap.put(country, cities);
                continentsMap.put(continent, countriesMap);
            } else {
                Map<String, List<String>> mapByCountry = continentsMap.get(continent);

                if (!mapByCountry.containsKey(country)) {
                    List<String> currentCities = new ArrayList<>();
                    currentCities.add(city);
                    mapByCountry.put(country, currentCities);
                } else {
                    List<String> existingCities = mapByCountry.get(country);
                    existingCities.add(city);
                    mapByCountry.put(country, existingCities);
                }

                continentsMap.put(continent, mapByCountry);
            }
        }
        continentsMap.forEach((continent, countriesAndCities) -> {
            System.out.println(continent + ":");
            countriesAndCities.forEach((key, value) -> System.out.printf("  %s -> %s%n", key, String.join(", ", value)));
        });
    }
}