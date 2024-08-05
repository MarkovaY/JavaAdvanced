package Lab.Generics.ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 42, 77, 32, 854, 12);

        Integer maxInt = ListUtil.getMax(list);

        Integer minInt = ListUtil.getMin(list);

        System.out.println("Highest number: " + maxInt);
        System.out.println("Lowest number:" + minInt);
    }
}
