package Lab.Generics.ArrayCreator;

public class Main {
    public static void main(String[] args) {

        String[] arr = ArrayCreator.create(5, "abc");

        for (String s : arr) {
            System.out.print(s + " ");
        }

        Integer[] arr1 = ArrayCreator.<Integer>create(Integer.class, 3, 72);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
