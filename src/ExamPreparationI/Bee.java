package ExamPreparationI;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Size of square matrix
        int size = Integer.parseInt(scanner.nextLine());

        // Matrix
        char[][] beeTerritory = new char[size][size];

        //Bee coordinates
        int beeRow = 0;
        int beeCol = 0;

        int pollinatedFlowers = 0;

        //Read matrix
        for (int row = 0; row < size; row++) {

            char[] singleRow = scanner.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {
                beeTerritory[row][col] = singleRow[col];

                // Find where the bee is
                if (beeTerritory[row][col] == 'B'){
                    beeRow = row;
                    beeCol = col;
                }
            }

        }
        String command = scanner.nextLine();
        //Move in different directions
        while (!command.equals("End")){
            //Move the bee - put . on old coordintaes, put B on new ones;
            beeTerritory[beeRow][beeCol] = '.';

            if ("right".equals(command) && beeCol != size - 1) {
                beeCol++;
            } else if ("left".equals(command) && beeCol != 0) {
                beeCol--;
            } else if ("up".equals(command) && beeRow != 0) {
                beeRow--;
            } else if ("down".equals(command) && beeRow != size - 1) {
                beeRow++;
            } else {
                beeTerritory[beeRow][beeCol] = '.';
                System.out.println("The bee got lost!");
                break;
            }

            char currentTerritoryElement = beeTerritory[beeRow][beeCol];
            if (currentTerritoryElement == 'f'){
                //Increase pollinated flowers
                pollinatedFlowers++;
            } else if (currentTerritoryElement == 'O'){
                // If we have a bonus move, repeat the previous move once again
                continue;
            }
            beeTerritory[beeRow][beeCol] = 'B';
            command = scanner.nextLine();
        }

        if (pollinatedFlowers < 5){
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        }

        printMatrix(beeTerritory);

    }
    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char element : arr) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
