package Lab.Generics.GenericScale;

public class Scale<T extends Comparable<T>> {

        //    Create a class Scale<T> that holds two elements - left and right. The scale should receive the elements through its single constructor:
        //            •	Scale(T left, T right)
        //    The scale should have a single method:
        //            •	T getHeavier()
        //    The greater of the two elements is heavier. The method should return null if elements are equal.

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){

        if(left.equals(right)){
            return null;
        }

        int result = left.compareTo(right);

        if(result > 0) {
            return left;
        }

        return right;
    }
}
