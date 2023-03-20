package ExamPreparationII;

import java.util.Scanner;

public class ReVolt {

    private static int playerRow = 0;
    private static int playerCol = 0;
    public static boolean hasWon = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Size of the matrix
        int size = Integer.parseInt(scanner.nextLine());
        //Commands we will have to do
        int commandsCount = Integer.parseInt(scanner.nextLine());

        char[][] playingBoard = new char[size][size];


        for (int row = 0; row < size; row++) {
            //Filling the board with the initial values
            char[] singleCol= scanner.nextLine().toCharArray();

            for (int col = 0; col < size; col++) {
                playingBoard[row][col] = singleCol[col];

                //Finding where the player's position is
                if (playingBoard[row][col] == 'f'){
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

        while (commandsCount-- > 0 && !hasWon){

            String command = scanner.nextLine();

            if(command.equals("up")) {
                movePlayer(playingBoard, -1, 0);
            } else if (command.equals("down")) {
                movePlayer(playingBoard, 1, 0);
            } else if (command.equals("left")) {
                movePlayer(playingBoard, 0, -1);
            }else if (command.equals("right")) {
                movePlayer(playingBoard, 0, 1);
            }


        }
        System.out.println(hasWon ? "Player won!" : "Player lost!");
        printBoard(playingBoard);
    }

    private static void movePlayer(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = playerRow + rowMutator;
        int nextCol = playerRow + colMutator;

        if(isOutOfBounds(matrix, nextRow, nextCol)){
            //nextRow < 0 || nextRow >= matrix.length
            //nextCol < 0 || nextCol >= matrix[row].length

            if (nextRow < 0 || nextRow >= matrix.length){
                nextRow = nextRow < 0 ? matrix.length - 1 : 0;
            } else {
                nextCol = nextCol < 0 ? matrix[nextRow].length - 1 : 0;
            }

        }

        if(matrix[nextRow][nextCol] == 'T'){
            return;
        } else if (matrix[nextRow][nextCol] == 'F'){
            hasWon = true;
        } else if (matrix[nextRow][nextCol] == 'B'){
            matrix[playerRow][playerCol] = '-';
            playerRow = nextRow;
            playerCol = nextCol;
            movePlayer(matrix, rowMutator, colMutator);
            return;
        }

        if(matrix[playerRow][playerCol] != 'B' && matrix[playerRow][playerCol] != 'T'){
            matrix[playerRow][playerCol] = '-';
        }

        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;


    }


    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    public static void printBoard (char[][] matrix){
        for (char[] arr : matrix) {
            for (char element : arr) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
