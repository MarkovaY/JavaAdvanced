package Lab.IteratorsAndComparators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library library = new Library(bookOne, bookTwo, bookThree);

        for (Book book: library) {
            System.out.println(book.getTitle());
        }

        List<Book> books = new ArrayList<>();

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        for (Book book : library) {
            System.out.println(book.getTitle() + " " + book.getYear());
        }

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.printf("%s is before %s%n", bookOne.getTitle(), bookTwo.getTitle());
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.printf("%s is before %s%n", bookTwo.getTitle(), bookOne.getTitle());
        } else {
            System.out.println("Book are equal");
        }


    }
}
