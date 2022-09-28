package Lab.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String address = "resources/input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path).sorted().toList();

        Files.write(Paths.get("resources/06.SortLinesOutput.txt"), lines);

    }
}