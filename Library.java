/**
 * Question 2 a. create a public class Library.
 * A class to hold details of library books.
 * Books can be added and removed to the library.
 * Books can be checked to see if they are available.
 *
 * @author Andrew Stevens
 * @version V1.0 07/11/2021
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Library
{
    /**
     * Question 2 b.
     * Add instance variables an ArrayList of type Book 
     * and name of type String to represent a library. 
     */
    private ArrayList<Book> books;
    private String name;

    /**
     * Question 2 c.
     * Constructor for objects of class Library
     */
    public Library(String aName)
    {
        // initialise instance variables
        name = aName;
        books = new ArrayList<>();
    }

    /**
     * Question 2 d. i.
     * Add a book to the collection.
     * @param author Name of the author.
     * @param title Title of the book.
     * @param id Unique ID of the book in the library.
     */
    public void addBook(String author, String title, String id)
    {
        // put your code here
        books.add(new Book(author, title, id));
    }

    /**
     * Question 2 d. ii.
     * Calculate fine 2% of book cost for each day late.
     * @param price Price of the book.
     * @param days Number of days book is overdue.
     * @return fine
     */
    public double calculateFine(double price, int days)
    {
        price = price * 0.02;
        double fine = price * days;
        return fine;
    }
    
    /**
     * Question 2 d. iii.
     * Return an ArrayList of books with matching titles.
     * @param title Book title as a String.
     * @return ArrayList of books in the library matching the search parameter.
     */
    
    public ArrayList<Book> getMatchingBooks(String title)
    {
        ArrayList<Book> matchingBooks = new ArrayList<Book>();
        for(Book book : books)
        {
            if(book.getTitle().equals(title))
            {
                //Book b = new Book(book.getAuthor(), book.getTitle(), book.getId());
                matchingBooks.add(book);
            }
        }
        return matchingBooks;       
    }
    
    /**
     * Question 2 d. iv.
     * Takes a Book as an argument and returns true if the ID matches that of a book in the library and it is not on loan.
     * @param Book bookToCheck as a Book.
     * @return true.
     */
    public boolean isAvailable(Book bookToCheck)
    {
        for(Book book : books)
        {
            if(book.getTitle().equals(bookToCheck.getTitle()) && book.isOnLoan() == false)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Question 2 d. v.
     * Lists all books in the library in the order they appear.
     */
    public void listAllBooks()
    {
        int index = 0;
        while(index < books.size())
        {
            Book bookName = books.get(index);
            System.out.println(bookName);
            index++;
        }
    }
    
    /**
     * Question 2 d. vi.
     * Get the first book in the collection with a matching ID and set it to be on loan.
     * @param Book bookToLoan as an object of Book.
     */
    public void loanBook(Book bookToLoan)
    {
        for(Book book : books)
        {
            if(book.getId().equals(bookToLoan.getId()))
            {
                book.setOnLoan(true);
            }
        }
    }
    
    
    /**
     * Question 2 d. vii.
     * Takes a Book as an argument and removes the first book with a matching ID.
     * @param Book bookToRemove.
     */
    public void removeBook(Book bookToRemove)
    {
        Iterator<Book> it = books.iterator();
        while(it.hasNext())
        {
            Book b = it.next();
            String bookId = b.getId();
            if(bookId.equals(bookToRemove.getId()))
            {
                it.remove();
            }
        }
    }
}
