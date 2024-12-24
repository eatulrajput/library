# Library Management System

## Overview
The Library Management System is a Java-based console application designed to manage a collection of books. It provides functionality to add, remove, list, check out, and return books in the library.

## Features
- **Add Book**: Add new books to the library collection with a unique ID.
- **Remove Book**: Remove a book from the library using its ID.
- **List Books**: Display all books in the library, including their status (checked out or available).
- **Check Out Book**: Check out a book from the library by its ID.
- **Return Book**: Return a previously checked-out book to the library.

## Classes and Structure
### 1. `Book`
The `Book` class represents a book in the library.
- **Attributes**:
  - `id`: Unique identifier for the book.
  - `title`: Title of the book.
  - `author`: Author of the book.
  - `isCheckedOut`: Status of the book (checked out or not).
- **Methods**:
  - Getters for `id`, `title`, and `author`.
  - Setter for `isCheckedOut`.
  - `toString()` for displaying book details.

### 2. `Library`
The `Library` class manages the collection of books.
- **Attributes**:
  - `books`: A `Map` of books with the ID as the key.
- **Methods**:
  - `addBook`: Adds a new book to the collection.
  - `removeBook`: Removes a book from the collection.
  - `listBooks`: Displays all books in the library.
  - `checkOutBook`: Marks a book as checked out.
  - `returnBook`: Marks a book as returned.

### 3. `LibraryManagementSystem`
The `LibraryManagementSystem` class provides a user interface to interact with the library.
- A menu-driven interface allows users to perform various operations on the library.

## How to Run
1. **Compile the Code**:
   Use the `javac` command to compile the code:
   ```bash
   javac LibraryManagementSystem.java
   ```
2. **Run the Program**:
   Execute the program using the `java` command:
   ```bash
   java LibraryManagementSystem
   ```

3. **Follow the Menu**:
   Interact with the program by selecting options from the menu.

## Example Usage
### Adding a Book:
```
Enter book ID: 101
Enter Book Title: The Great Gatsby
Enter Book Author: F. Scott Fitzgerald
Book added successfully.
```

### Listing Books:
```
Book{id='101', title='The Great Gatsby', author='F. Scott Fitzgerald', isCheckedOut=false}
```

### Checking Out a Book:
```
Enter book ID to check out: 101
Book checked out successfully.
```

### Returning a Book:
```
Enter book ID to return: 101
Book returned successfully.
```

### Removing a Book:
```
Enter book ID to remove: 101
Book removed successfully.
```

## Requirements
- Java 8 or higher

## Limitations
- The system does not persist data between sessions. All changes are lost once the program terminates.
- Books are identified solely by their ID. Duplicate IDs are not allowed.

## Future Enhancements
- Add file-based or database storage to persist data.
- Enhance the user interface.
- Add user management for tracking borrowers.

## License
This project is open-source and available under the [MIT License](LICENSE).

