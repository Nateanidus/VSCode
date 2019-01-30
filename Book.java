import java.awt.image.TileObserver;

public class Book {
   
    // Attributes are properties of the Book Object that we can manipulate.
    protected String author;
    protected String title;
    protected String publicationDate;
    
    // Constructors create the Book Object either with default attributes or custom attributes.
    public Book() {
        this.author = "Daniel Cisneros";
        this.title = "CharDeeMacDennis";
        this.publicationDate = "2019";
    }

    public Book(String author, String title, String publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    // Setters will set the value of one property using a method.
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    // Getters
    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    // Additional Methods are methods that do extra work for us. 
    public void printToConsole() {
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Publication Date: " + this.publicationDate);
    }


}