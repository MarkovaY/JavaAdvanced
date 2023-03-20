package examRetake;

import java.util.Scanner;

public class naviBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] battlefield = new char[size][size];

        int shipRow = 0;
        int shipCol = 0;

        for (int row = 0; row < size; row++) {

            char[] singleLine = scanner.nextLine().toCharArray();
            for (int col = 0; col < size; col++) {

                battlefield[row][col] = singleLine[col];

                if(battlefield[row][col] == 'S'){
                    shipRow = row;
                    shipCol = col;
                }
            }
        }

        int cruisersSunk = 0;
        int hitsTaken = 0;

        String command = scanner.nextLine();
        while (hitsTaken < 3 && cruisersSunk < 3){

            battlefield[shipRow][shipCol] = '-';
            switch(command){
                case "up":
                    shipRow--;
                    break;
                case "down":
                    shipRow++;
                    break;
                case "left":
                    shipCol--;
                    break;
                case "right":
                    shipCol++;
                    break;
            }

            char currentElement = battlefield[shipRow][shipCol];

            if(currentElement == '*'){
                hitsTaken++;
            } else if (currentElement == 'C'){
                cruisersSunk++;
            }

            battlefield[shipRow][shipCol] = 'S';
            command = scanner.nextLine();
        }

        if (cruisersSunk == 3){
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
        } else if (hitsTaken == 3){
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", shipRow, shipCol);
        }
        printBattlefield(battlefield);
    }

    private static void printBattlefield(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char element : arr) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
