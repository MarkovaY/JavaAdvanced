package Exercise.SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Creating a map of the players and their cards
        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String[] cardsDrawn = input.split(": ")[1].split(", ");

            // Using a set to filter the cards, no repeating cards are allowed
            HashSet<String> cardsSet = new HashSet<>(Arrays.asList(cardsDrawn));

            // Filling the map with the players and their cards
            if (!players.containsKey(name)) {
                players.put(name, cardsSet);
            } else {
                HashSet<String> currentCardsSet = new HashSet<>(players.get(name));
                currentCardsSet.addAll(Arrays.asList(cardsDrawn));
                players.put(name, currentCardsSet);
            }

            input = scanner.nextLine();
        }

        // Printing the results
        for (var player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.println(name + ": " + points);
        }
    }

    // A method that calculates the points a player gets from their cards
    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String color = card.substring(card.length() - 1);
            int pointsCard = getPower(power) * getColor(color);
            points += pointsCard;
        }
        return points;
    }

    // A method which returns the color
    private static int getColor(String color) {
        switch (color) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }

    // A method which returns the power
    private static int getPower(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}