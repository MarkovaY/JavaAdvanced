package Lab.Generics.ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtil {

//    Create a class ListUtils that you will use through several other exercises:
//    The class should have two static methods:
//            •	T getMin(List<T> list)
//            • T getMax(List<T> list)
//    The methods should throw IllegalArgumentException if an empty list is passed.

    public static <T extends Comparable<T>> T getMax(List<T> list){

        ensureNotEmpty(list);

        return Collections.max(list);
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        ensureNotEmpty(list);

        return Collections.min(list);
    }

    private static <T> void ensureNotEmpty(List<T> list) {

        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty!");
        }
    }
}
