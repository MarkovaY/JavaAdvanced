package Exercise.DefiningClasses.CatLady;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, Cat> cats = new HashMap<>();
        while (!input.equals("End")) {

            String catBreed = input.split("\\s+")[0];
            String name = input.split("\\s+")[1];

            Cat cat = null;
            switch (catBreed) {
                case "Siamese":
                    double earSize = Double.parseDouble(input.split("\\s+")[2]);
                    cat = new Siamese(name, earSize);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(input.split("\\s+")[2]);
                    cat = new Cymric(name, furLength);
                    break;
                case "StreetExtraordinaire":
                    double meowingDecibels = Double.parseDouble(input.split("\\s+")[2]);
                    cat = new StreetExtraordinaire(name, meowingDecibels);
                    break;
            }
            cats.put(name, cat);
            input = scanner.nextLine();
        }

        String catName = scanner.nextLine();
        if (cats.containsKey(catName)) {
            System.out.println(cats.get(catName));
        }
    }
}