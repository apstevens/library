
/**
 * Maintains information on a Book.
 * Could be used to form a larger application such as a library system.
 *
 * @author Andrew Stevens
 * @version v1.0 01/10/2021
 * @description Create a book class that could be used by a library
 * 
 *
 */

public class Book
{
    /**
     * Add private fields of type String for author, title and id
     * and one of type boolean onLoan.
     */
    private String author;
    private String title;
    private String id;
    private boolean onLoan;
    
    /**
     * Constructor for objects of class Book
     * @param anAuthor Author name.
     * @param aTitle Book title.
     * @param anId Book id.
     */
    public Book(String anAuthor, String aTitle, String anId)
    {
        // initialise instance variables
        author = anAuthor;
        title = aTitle;
        id = anId;
        onLoan = false; 
    }

    /**
     * getter method that returns author name of type String.
     * @return author 
     */
    public String getAuthor()
    {
        // put your code here
        return author;
        
    }
    
    /**
     * getter method that returns book name of type String.
     * @return title 
     */
    public String getTitle()
    {
        // put your code here
        return title;
        
    }
    
    /**
     * getter method that returns id of type String.
     * @return id
     */
    public String getId()
    {
        // put your code here
        return id;
        
    }
    
    /**
     * Setter method sets boolean value.
     * @param loaned 
     */
     public void setOnLoan(boolean loaned)
    {
        onLoan = loaned;
    } 
    
    /**
     * Method to return if the book is available.
     * @return onLoan 
     */
    public boolean isOnLoan()
    {
        return onLoan;
    }
    
    /**
     * Returns a string describing the book .
     * @return title + author + onLoan
     */
    public String toString()
    {
        return "Title: " + title + ", Author: " + author + " " + (onLoan ? "(on loan)": "(available)");
    }
    
    /**
     * Method to check the book has a valid id and returns true if it does.
     * @return true 
     */
    public boolean verifyId()
    {
        int idLength = id.length();
        if(idLength == 7) 
        {
            int total = 0;
            for(int i = 0; i < id.length(); i++)
            {
                String ch = id;
                total += ch.charAt(i) % 10;  
            }
            if(total % 7 == 0)
                {
                    return true;
                }
                else 
                {
                    return false;
                }
        } 
        else
        {
            return false;   
        }
        
    }
}
