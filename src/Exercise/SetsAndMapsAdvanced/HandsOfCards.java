package Exercise.SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String[] cardsDrawn = input.split(": ")[1].split(", ");

            HashSet<String> cardsSet = new HashSet<>(Arrays.asList(cardsDrawn));

            if (!players.containsKey(name)) {
                players.put(name, cardsSet);
            } else {
                HashSet<String> currentCardsSet = new HashSet<>(players.get(name));
                currentCardsSet.addAll(Arrays.asList(cardsDrawn));
                players.put(name, currentCardsSet);
            }

            input = scanner.nextLine();
        }

        for (var player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.println(name + ": " + points);
        }
    }

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