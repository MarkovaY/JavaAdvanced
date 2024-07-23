package Lab.Generics.ArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    //    Create a class ArrayCreator with a method and a single overload to it:
    //            •	static T[] create(int length, T item)
    //            •	static T[] create(Class<T> class, int length, T item)
    //    The method should return an array with the given length, and every element should be set to the given default item.

    public static <T> T[] create(int length, T defaultValue) {

        return create(defaultValue.getClass(), length, defaultValue);
    }

    public static <T> T[] create(Class<?> clazz, int length, T defaultValue) {

        T[] arr = (T[]) Array.newInstance(defaultValue.getClass(), length);

        Arrays.fill(arr, defaultValue);

        return arr;
    }
}
