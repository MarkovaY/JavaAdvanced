package Lab.IteratorsAndComparators.Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {

    //    Create a class Library from the UML diagram below:
    //    <<Iterable<Book>>> Library
    //      -	books: Book[]
    //      +	iterator(): Iterator<Book>
    //    Create a nested class LibIterator from the UML diagram below:
    //    <<Iterator<Book>>> LibIterator
    //      -	counter: int
    //      +	hasNext(): boolean
    //      +	next(): Book

    private class LibIterator implements Iterator<Book> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }

    private Book[] books;


    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

}
