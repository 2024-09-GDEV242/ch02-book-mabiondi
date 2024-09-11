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
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set all of the fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
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
     * 2.89 Modified method to print reference number if length > 0
     * 2.91 Modified method to print number of times book has been borrowed
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.print("Reference Number: ");
        if(refNumber.length() > 0)
        {
            System.out.println(refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }
        System.out.println("Number of Times Borrowed: " + borrowed);
    }
    
    /**
     * 2.88 Mutator for ref number
     * 2.90 Modified to only accept a string of length >= 3
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("ERROR: Reference number must be at least 3 characters long.");
        }
    }
    
    /**
     * 2.88 Accessor for ref number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * 2.91 Mutator for borrow count (increases by 1 each time book is borrowed)
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * 2.91 Accessor for borrow count
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * 2.92 Accessor for whether the book is a course text
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
