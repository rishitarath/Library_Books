package bookdb;

import java.util.ArrayList;
//has the features of graphic novels and properties of PhysicalBook
public class DigitalGraphicNovel extends EBook implements GraphicNovel {
    private int pages;
    private boolean colorPalette;

    public DigitalGraphicNovel(String title, String author, ArrayList<String> genres, int pages, boolean colorPalette, String format) {
        super(title, author, genres, format); // Call EBook constructor
        this.pages = pages;
        this.colorPalette = colorPalette;
    }

    @Override
    public boolean getPalette() {
        return colorPalette;
    }

    @Override
    public int getPages() {
        return pages;
    }
    @Override
    public void print() {
    	System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genres: " + String.join(" ", getGenres())); // Ensures correct format
        System.out.println("Format: " + getFormat());
        System.out.println("Pages: " + pages);
        System.out.println("Color palette: " + (colorPalette ? "Full Colour" : "black and white"));
        System.out.println("Type: Digital Graphic Novel"); // Required format
    }
}
