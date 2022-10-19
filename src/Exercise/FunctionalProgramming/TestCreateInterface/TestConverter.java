package Exercise.FunctionalProgramming.TestCreateInterface;

import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calling the interfaces created (even if not very useful)

        Converter converter = text -> text + "bye";

        TriFunction<String, Integer, Double, Scanner> testTri = (text, number, decimal) -> new Scanner(System.in);
    }
}