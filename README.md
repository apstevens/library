# Library System

## Project Overview

This project involves creating a basic library system in Java.  The system is designed to maintain information about books and their availability within a library.  The project comprises two primary classes **Book** and **Library**.

## Author
Andy Stevens

## Version

1.0

## Date
01/10/2021

# Class Descriptions

## Book Class

The **Book** class is designed to encapsulate the details of a book, including its author, title, unique identifier, and loan status.

**Fields**

- **private String author**: The author of the book.
- **private String title**: The title of the book.
- **private String id**: A unique identifier for the book.
- **private boolean onLoan**: Indicates whether the book is currently on loan.

**Constructor**

**public Book(String anAuthor, String aTitle, String anId)**: Initialises a new **Book** object with the specified author, title and ID. Sets **onLoan** to **false**.

**Methods**

**public String getAuthor()**:
 
**public String getTitle()**: Returns the title of the book.
**public String getId()**: Returns the ID of the book.
**public void setOnLoan(boolean loaned)**: Sets the loan status of the book.
**public boolean isOnLoan()**: Returns the loan status of the book.
**public String toString()**: Returns a string representation of the book, including title, author, and loan status.
**public boolean verifyId()**: Verifies if the book ID is valid (must be 7 characters long and the sum of the ASCII values of the characters must be divisible by 7).

# Library Class

The **Library** class is designed to manage a collection of **Book** objects, providing functionalities to add, remove, and check the availability of books.

**Fields**

**private ArrayList<Book> books**: A collection of Book objects representing the library's inventory.
**private String name**: The name of the library.

**Constructor**

**public Library(String aName)**: Initializes a new Library object with the specified name and an empty list of books.
Methods
**public void addBook(String author, String title, String id)**: Adds a new book to the library's collection.
public double calculateFine(double price, int days): Calculates the fine for an overdue book (2% of the book's price per day).
**public ArrayList<Book> getMatchingBooks(String title)**: Returns a list of books with matching titles.
**public boolean isAvailable(Book bookToCheck)**: Checks if a book is available (not on loan) in the library.
**public void listAllBooks()**: Prints the details of all books in the library.
**public void loanBook(Book bookToLoan)**: Sets the loan status of the first book with a matching ID to true.
**public void removeBook(Book bookToRemove)**: Removes the first book with a matching ID from the library's collection.

#Usage

To use the library system, create instances of the **Library** and **Book** classes and utilize their methods to manage the collection of books. For example, you can add books to the library, check their availability, and manage loans.


```
Library library = new Library("City Library");
library.addBook("George Orwell", "1984", "1234567");
library.addBook("J.K. Rowling", "Harry Potter", "2345678");

Book book = new Book("George Orwell", "1984", "1234567");
boolean isAvailable = library.isAvailable(book);

if (isAvailable) {
    library.loanBook(book);
}

library.listAllBooks();
library.removeBook(book);
```