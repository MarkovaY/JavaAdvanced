package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int racingNumber = Integer.parseInt(scanner.nextLine());

        String[][] track = new String[size][size];

        for (int row = 0; row < size; row++) {
            String[] columnArr = scanner.nextLine().split("\\s+");

            track[row] = columnArr;
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            switch (command){
                case "left":
                    break;
                case "right":
                    break;
                case "up":
                    break;
                case "down":
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
