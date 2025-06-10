package bookdb;

import java.util.ArrayList;

// collected all the fields and methods that are common to the AudioBook, EBook, and PhysicalBook classes.
public abstract class Book { 
// Marked as abstract because An abstract class cannot be instantiated, meaning you cannot create an object of Book directly.
    protected String title;
    protected String author;
    protected ArrayList<String> genres;

    // to ensure zero code duplication we Instead of defining title, author, and genres in each subclass, move them to the Book superclass
    public Book(String title, String author, ArrayList<String> genres) {
        this.title = title;
        this.author = author;
        this.genres = new ArrayList<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<String> getGenres() {
        return new ArrayList<>(genres); // Return a copy to prevent modification
    }
 // Abstract method to be implemented in subclasses
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genres: " + String.join(", ", genres));
    }
}
//no unnecessary code duplication exists
//subclasses call the super() constructor to avoid repeating initialization logic.
//Removed unnecessary getters from subclasses.
