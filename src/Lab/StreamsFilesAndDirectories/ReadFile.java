package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\bubav\\Desktop\\StreamsResources\\input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int bytes = fileInputStream.read();

            while (bytes >= 0) {

                System.out.printf("%s ", Integer.toBinaryString(bytes));

                bytes = fileInputStream.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}