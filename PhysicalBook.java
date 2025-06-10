package bookdb;

import java.util.ArrayList;

public class PhysicalBook extends Book {
    private int pages;

    public PhysicalBook(String title, String author, ArrayList<String> genres, int pages) {
        super(title, author, genres); // Call the superclass constructor
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
    
    @Override
    public void print() {
        super.print(); // Print common book details
        System.out.println("Pages: " + pages);
        System.out.println("Type: Physical Book"); // Required format
    }
}
