package Exercise.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[dimensions][dimensions];
        fillMatrix(scanner, dimensions, matrix);

        int sumOne = 0;
        int sumTwo = 0;
        for (int row = 0; row < matrix.length; row++) {
            int col = 0;
            while (col < matrix[row].length) {
                int currentValue = matrix[row][col + row];
                int secondValue = matrix[row][matrix[col].length - 1 - row];
                sumOne += currentValue;
                sumTwo += secondValue;
                break;
            }
        }
        int difference = Math.abs(sumOne - sumTwo);

        System.out.println(difference);
    }

    private static void fillMatrix(Scanner scanner, int dimensions, int[][] matrix) {
        for (int row = 0; row < dimensions; row++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = elements;
        }
    }
}