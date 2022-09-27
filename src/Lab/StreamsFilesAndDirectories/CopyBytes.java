package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("resources/input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        PrintWriter printer = new PrintWriter(fileOutputStream);
        int bytes = fileInputStream.read();

        Set<Integer> specialSymbols = Set.of(10, 32);

        while (bytes >= 0) {

            boolean isSpecialSymbol = specialSymbols.contains(bytes);

            if (isSpecialSymbol) {
                printer.print((char) bytes);
            } else {
                printer.print(bytes);
            }

            bytes = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}