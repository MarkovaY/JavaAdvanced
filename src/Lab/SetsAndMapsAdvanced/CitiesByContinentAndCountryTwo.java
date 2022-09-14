package Lab.SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentAndCountryTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continentsMap = new LinkedHashMap<>();

        while (entries-- > 0) {
            String input = scanner.nextLine();

            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            continentsMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countriesAndCities = continentsMap.get(continent);
            countriesAndCities.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countriesAndCities.get(country);
            cities.add(city);
        }
        continentsMap.forEach((continent, countriesAndCities) -> {
            System.out.println(continent + ":");
            countriesAndCities.forEach((key, value) -> System.out.printf("  %s -> %s%n", key, String.join(", ", value)));
        });
    }
}