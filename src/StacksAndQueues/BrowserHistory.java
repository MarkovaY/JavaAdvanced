package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> uRLs = new ArrayDeque<>();
        String currentURL = "";
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (uRLs.size() > 1) {
                    uRLs.pop();
                    currentURL = uRLs.peek();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                uRLs.push(input);
                currentURL = uRLs.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}