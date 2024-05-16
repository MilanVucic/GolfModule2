package lesson_3.library;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<Author> author;
    private int yearOfPublication;
    private BookStatus bookStatus;

    public String getIsbn() {
        return isbn;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
}
