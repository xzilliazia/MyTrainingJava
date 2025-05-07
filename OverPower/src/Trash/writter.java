package Trash;
import java.io.FileWriter;
import java.io.IOException;

public class writter {
    public static void main(String[] args) {
        
        try {
            FileWriter mywriter = new FileWriter("example.txt");
            mywriter.write("saya mencoba pakai writer");
            mywriter.close();
            System.out.println("Success write a word");
        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
            
        }
    }
}
