import java.util.*;

class Book {
    private String id;
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "Book{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
}

class Library {
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String id, String title, String author) {
        if (books.containsKey(id)) {
            System.out.println("Book with this ID already exists.");
        } else {
            books.put(id, new Book(id, title, author));
            System.out.println("Book added successfully.");
        }
    }

    public void removeBook(String id) {
        if (books.containsKey(id)) {
            books.remove(id);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book with this ID does not exist.");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    public void checkOutBook(String id) {
        Book book = books.get(id);
        if (book == null) {
            System.out.println("Book with this ID does not exist.");
        } else if (book.isCheckedOut()) {
            System.out.println("Book is already checked out.");
        } else {
            book.setCheckedOut(true);
            System.out.println("Book checked out successfully.");
        }
    }

    public void returnBook(String id) {
        Book book = books.get(id);
        if (book == null) {
            System.out.println("Book with this ID does not exist.");
        } else if (!book.isCheckedOut()) {
            System.out.println("Book was not checked out.");
        } else {
            book.setCheckedOut(false);
            System.out.println("Book returned successfully.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Check Out Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(id, title, author);
                    break;

                case 2:
                    System.out.print("Enter book ID to remove: ");
                    String removeId = scanner.nextLine();
                    library.removeBook(removeId);
                    break;

                case 3:
                    library.listBooks();
                    break;

                case 4:
                    System.out.print("Enter book ID to check out: ");
                    String checkOutId = scanner.nextLine();
                    library.checkOutBook(checkOutId);
                    break;

                case 5:
                    System.out.print("Enter book ID to return: ");
                    String returnId = scanner.nextLine();
                    library.returnBook(returnId);
                    break;

                case 6:
                    System.out.println("Exiting Library Management System. Goodbye.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
