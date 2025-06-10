package bookdb;

import java.util.ArrayList;
//has the features of graphic novels and properties of PhysicalBook
public class PhysicalGraphicNovel extends PhysicalBook implements GraphicNovel {
    private boolean colorPalette;

    public PhysicalGraphicNovel(String title, String author, ArrayList<String> genres, int pages, boolean colorPalette) {
        super(title, author, genres, pages); // Call PhysicalBook constructor
        this.colorPalette = colorPalette;
    }

    @Override
    public boolean getPalette() {
        return colorPalette;
    }

    @Override
    public int getPages() {
        return super.getPages(); // Use PhysicalBook's method
    }
    @Override
    public void print() {
        //super.print(); // Print details from PhysicalBook
    	System.out.println("Title: " + getTitle()); 
        System.out.println("Author: " + getAuthor()); 
        System.out.println("Genres: " + String.join(", ", getGenres())); 
        System.out.println("Pages: " + getPages()); 
    	System.out.println("Color palette: " + (colorPalette ? "Full Colour" : "black and white "));
        System.out.println("Type: Physical Graphic Novel"); // Required format
    }
}
