package lesson_3.library;

import java.time.LocalDate;
import java.util.List;

public class Library {
    private String name;
    private List<User> users;
    private List<Book> books;
    private List<Transaction> transactions;

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {

    }

    public void borrowBook(Book book, User borrower) {
        Transaction transaction = new Transaction(
                LocalDate.now(), book, borrower);
        book.setBookStatus(BookStatus.BORROWED);
        transactions.add(transaction);
    }

    public void returnBook(int transactionId) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                transaction.setReturnDate(LocalDate.now());
                transaction.getBorrowedBook().setBookStatus(BookStatus.AVAILABLE);
            }
        }
    }
}
