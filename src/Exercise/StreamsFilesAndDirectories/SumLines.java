package Exercise.StreamsFilesAndDirectories;

import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resourcesExercise/input.txt"));

        // Reading a line from the file
        String line = bufferedReader.readLine();

        // Iterating through each line from the txt file
        while (line != null) {

            // Int sum of the all the chars in a line
            int sum = 0;

            // Iterating through each symbol in the line
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }

            // Printing the sum for each line
            System.out.println(sum);

            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}