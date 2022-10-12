package Exercise.MultidimentionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("[()]");
        int degrees = Integer.parseInt(command[1]);
        int angleOfRotation = degrees % 360;

        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();

        int maxLengthWord = Integer.MIN_VALUE;
        while (!input.equals("END")) {
            // Adding all the words to a list
            words.add(input);
            // Finding the longest word
            if (input.length() > maxLengthWord) {
                maxLengthWord = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = maxLengthWord;

        // Creating the basic matrix and filling it
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currentWord.length()) {
                    char currentSymbol = currentWord.charAt(col);
                    matrix[row][col] = currentSymbol;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        // Printing the matrix according to the angle of rotation asked for
        switch (angleOfRotation) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}