package Exercise.StreamsFilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resourcesExercise/input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("allCapitals"));

        // Reading a line from the file
        String line = bufferedReader.readLine();

        // Iterating through the text
        while (line != null) {

            // Turning each line to upper case
            String newLine = line.toUpperCase();

            // Writing the line in a file
            writer.write(newLine);
            writer.println();

            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        writer.close();
    }
}