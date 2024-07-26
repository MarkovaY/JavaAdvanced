package Lab.Generics.JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {

        //    Create a class Jar<> that can store anything.
        //    It should have two public methods:
        //            •	void add(element)
        //            •	element remove()
        //    Adding should add on top of its contents. Remove should get the topmost element.

    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add(T element) {
        stack.push(element);
    }

    public T remove() {
        return stack.pop();
    }
}
