package Lab.StreamsFilesAndDirectories;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("everyThirdLine.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        String line = reader.readLine();
        int counter = 1;
        while (line != null) {

            if (counter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }

            line = reader.readLine();
            counter++;
        }
        reader.close();
        writer.close();
    }
}