package subClass;
import superclass.*;

public class Books extends Media {
    private String writer;
    private int numberOfPages;

    public Books(int id, String title, boolean available, String writer, int numberOfPages){
        super(id, title, available);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public void info() {
        System.out.println("Buku: " + getTitle() + "\nPenulis: " + writer + "\nHalaman: "+ numberOfPages);
    }
}
