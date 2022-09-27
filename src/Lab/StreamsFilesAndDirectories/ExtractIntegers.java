package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream stream = new FileInputStream("resources/input.txt");
        Scanner scanner = new Scanner(stream);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
    }
}