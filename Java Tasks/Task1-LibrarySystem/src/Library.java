import java.util.Vector;
import java.util.Scanner;

public class Library {
    public Vector<Book> books = new Vector<>();

    public void addBook(int code, String title) {
        books.add(new Book(code, title));
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\nBooks in Library:");
        for (Book b : books) {
            System.out.println("Code: " + b.getBookCode() +
                    ", Title: " + b.getTitle() +
                    ", Status: " + b.bookStatus());
        }

    }

    public void borrowBook(int code) {
        for (Book b : books) {
            if (b.getBookCode() == code) {
                if (!b.isBorrowed()) {
                    b.borrowBook();
                    System.out.println("Book '" + b.getTitle() + "' has been borrowed.");
                } else {
                    System.out.println("Book already borrowed or not available.");
                }
                return;
            }
        }
        System.out.println("Book code not found.");
    }

    public void returnBook(int code) {
        for (Book b : books) {
            if (b.getBookCode() == code) {
                if (b.isBorrowed()) {
                    b.returnBook();
                    System.out.println("Book '" + b.getTitle() + "' has been returned.");
                } else {
                    System.out.println("This book is not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book code not found.");
    }

    public void showBorrowedCount() {
        int numBorrowedBooks = 0;
        for (Book b : books) {
            if (b.isBorrowed()) numBorrowedBooks++;
        }
        System.out.println("Total borrowed books: " + numBorrowedBooks);
    }
}





