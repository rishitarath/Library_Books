package bookdb;

import java.util.ArrayList;

//extend Book while still maintaining all of the functionality they had in oldbookdb
public class AudioBook extends Book {
	private String format;
    private int bitrate;

    public AudioBook(String title, String author, ArrayList<String> genres, String format, int bitrate) {
        super(title, author, genres); // Call the superclass constructor
        this.format = format;
        this.bitrate = bitrate;
     
    }
   

    public String getFormat() {
        return format;
    }

    public int getBitrate() {
        return bitrate;
    }
    

    
    @Override
    //super helps display all the common details from the parent class
    public void print() {
        super.print(); // Print common book details
        System.out.println("Format: " + format);
        System.out.println("Bitrate: " + bitrate);
        System.out.println("Type: Audiobook"); // Required format
    }
}

