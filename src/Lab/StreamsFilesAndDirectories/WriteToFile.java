package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int bytes = fileInputStream.read();

        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');

        while (bytes >= 0) {

            char symbol = (char) bytes;

            boolean isPunctuation = punctuationTable.contains(symbol);

            if (!isPunctuation) {
                fileOutputStream.write(symbol);
            }

            bytes = fileInputStream.read();
        }
        System.out.println();
    }
}
