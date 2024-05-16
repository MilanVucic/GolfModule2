package lesson_3.library;

import java.time.LocalDate;

public class Transaction {
    public static final int DEFAULT_DAYS_TO_RETURN = 10;
    private static int NEXT_ID = 1;
    private int id;

    private LocalDate issuingDate;
    private LocalDate returnByDate;
    private LocalDate returnDate;
    private Book borrowedBook;
    private User borrower;

    public Transaction(LocalDate issuingDate, Book borrowedBook, User borrower) {
        this(issuingDate, null, borrowedBook, borrower);
    }

    public Transaction(LocalDate issuingDate, LocalDate returnDate, Book borrowedBook, User borrower) {
        this.issuingDate = issuingDate;
        this.returnDate = returnDate;
        this.borrowedBook = borrowedBook;
        this.returnByDate = issuingDate.plusDays(DEFAULT_DAYS_TO_RETURN);
        this.borrower = borrower;
        this.id = NEXT_ID++;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public int getId() {
        return id;
    }
}