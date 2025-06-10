package bookdb;

import java.util.ArrayList;

public class EBook extends Book {
    private String format;
   

    public EBook(String title, String author, ArrayList<String> genres, String format) {
        super(title, author, genres); // Call the superclass constructor
        this.format = format;
        
    }

    public String getFormat() {
        return format;
    }
    @Override
    public void print() {
        super.print(); // Print common book details
        System.out.println("Format: " + format);
        System.out.println("Type: E-Book"); // Required format
    }
}
