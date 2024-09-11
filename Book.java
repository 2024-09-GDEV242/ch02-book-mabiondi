/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Michael Biondi
 * @version 10 September 2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    /**
     * 2.83 Accessor for author field
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * 2.83 Accessor for title field
     */
    public String getTitle()
    {
        return title;
    }
}
