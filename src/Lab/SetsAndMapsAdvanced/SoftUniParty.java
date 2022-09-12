package Lab.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vipList = new TreeSet<>();
        Set<String> regularList = new TreeSet<>();

        while (!input.equals("PARTY")) {

            if (Character.isDigit(input.charAt(0))) {
                vipList.add(input);
            } else {
                regularList.add(input);
            }

            input = scanner.nextLine();
        }

        while (!input.equals("END")) {

            vipList.remove(input);
            regularList.remove(input);

            input = scanner.nextLine();
        }

        int guestsMissed = vipList.size() + regularList.size();

        System.out.println(guestsMissed);
        vipList.forEach(System.out::println);
        regularList.forEach(System.out::println);
    }
}