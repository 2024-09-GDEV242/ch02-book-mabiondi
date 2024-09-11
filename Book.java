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
    private int pages;
    private String refNumber;
    
    /**
     * Set all of the fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    
    /**
     * 2.84 Print method for author field
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * 2.84 Print method for title field
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * 2.85 Accessor for pages field
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * 2.87 Print method for book details
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
    /**
     * 2.88 Mutator for ref number
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    /**
     * 2.88 Accessor for ref number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
}
