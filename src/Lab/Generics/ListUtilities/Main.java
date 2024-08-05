package Lab.Generics.ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();

        Collections.addAll(listOfNumbers, 42, 77, 32, 854, 12);

        Integer maxInt = ListUtil.getMax(listOfNumbers);
        Integer minInt = ListUtil.getMin(listOfNumbers);

        System.out.println("Highest number: " + maxInt);
        System.out.println("Lowest number: " + minInt);
    }
}
