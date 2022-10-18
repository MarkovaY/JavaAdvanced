package Exercise.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resourcesExercise/input.txt"));

        // Reading a line from the file
        String line = bufferedReader.readLine();

        // Int sum of the all the chars in the text
        int sum = 0;

        // Iterating through each line from the txt file
        while (line != null) {
            // Iterating through each symbol in the line
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }

            line = bufferedReader.readLine();
        }
        // Printing the sum of all the chars in the text
        System.out.println(sum);

        bufferedReader.close();
    }
}