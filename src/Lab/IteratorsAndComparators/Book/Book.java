package Lab.IteratorsAndComparators.Book;

import java.util.Arrays;
import java.util.List;

public class Book {

    //    Create a class Book from the UML diagram below:
    //    Book
    //-	title: String
    //-	year: int
    //-	authors: List<String>
    //-	setTitle(String)
    //-	setYear(String)
    //-	setAuthors(String…)
    //+	getTitle(): String
    //+	getYear(): int
    //+	getAuthors(): List<String>
    //    You can use only one constructor. There can be no authors, one author, or many authors.

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String[] authors) {
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
