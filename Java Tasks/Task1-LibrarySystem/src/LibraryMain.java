import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                Library library = new Library();

                int choice;

                while (true) {
                    System.out.println("\n Library Book Borrowing System ");
                    System.out.println("1. Add Book");
                    System.out.println("2. Display All Books");
                    System.out.println("3. Borrow a Book");
                    System.out.println("4. Return a Book");
                    System.out.println("5. Show Total Borrowed Books");
                    System.out.println("0. Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                    input.nextLine();

                    if (choice == 0) {
                        System.out.println("Exiting program...");
                        break;
                    }

                    switch (choice) {

                        case 1:
                            System.out.print("Enter book code: ");
                            int code = input.nextInt();
                            input.nextLine();

                            System.out.print("Enter title: ");
                            String title = input.nextLine();

                            library.addBook(code, title);
                            break;

                        case 2:
                            library.displayBooks();
                            break;

                        case 3:
                            System.out.print("Enter book code to borrow: ");
                            library.borrowBook(input.nextInt());
                            break;

                        case 4:
                            System.out.print("Enter book code to return: ");
                            library.returnBook(input.nextInt());
                            break;

                        case 5:
                            library.showBorrowedCount();
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            }
        }