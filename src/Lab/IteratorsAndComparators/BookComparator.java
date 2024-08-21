package Lab.IteratorsAndComparators;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

//    Create a class BookComparator from the UML diagram below:
//         <<Comparator<Book>>> BookComparator
//            +	compare(Book, Book): int
//    BookComparator has to compare two books by:
//            1.	Book title.
//            2.	Year of publishing a book.

    @Override
    public int compare(Book f, Book s) {

        int result = f.getTitle().compareTo(s.getTitle());

        if(result == 0){
            result = Integer.compare(f.getYear(), s.getYear());
        }

        return result;
    }
}
