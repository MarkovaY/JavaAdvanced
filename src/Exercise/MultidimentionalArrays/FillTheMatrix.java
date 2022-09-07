package Exercise.MultidimentionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int dimensions = Integer.parseInt(input.split(", ")[0]);
        String typeOfMatrix = input.split(", ")[1];
        int[][] matrix = new int[dimensions][dimensions];

        int value = 1;
        if (typeOfMatrix.equals("A")) {

            for (int row = 0; row < dimensions; row++) {

                for (int col = 0; col < dimensions; col++) {
                    matrix[col][row] = value;
                    value++;
                }
            }
        } else if (typeOfMatrix.equals("B")) {

            for (int col = 0; col < dimensions; col++) {

                if (col % 2 == 0) {

                    for (int row = 0; row < dimensions; row++) {
                        matrix[row][col] = value;
                        value++;
                    }

                } else {

                    for (int row = dimensions - 1; row >= 0; row--) {
                        matrix[row][col] = value;
                        value++;
                    }
                }
            }
        }
        for (int[] arr : matrix) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}