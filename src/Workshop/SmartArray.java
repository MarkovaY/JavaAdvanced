package Workshop;

public class SmartArray {

    private static final int INITIAL_CAPACITY = 10;

    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    // void add(int element) - Adds the given element to the end of the list
    public void add (int element) {
        // increase capacity if needed
        if (this.size == this.capacity){
            resize();
        }

        this.data[this.size] = element;
        this.size++;
    }

    // int get(int index) - Returns the element at the specified position in this list

    public int get (int index) {

        checkIndex(index);
        return this.data[index];
    }

    // int remove(int index) - Removes the element at the given index
//    public int remove (int index) {
//
//
//    }

    private void checkIndex(int index) {

        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
    }


    private void resize() {
        this.capacity *= 2;
        int[] copyArray = new int[this.capacity];

        for (int i = 0; i < this.data.length; i++) {
            copyArray[i] = this.data[i];
        }
        this.data = copyArray;
    }
}
