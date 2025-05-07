package Trash;
import java.io.File;
import java.io.EOFException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("D:\\Java Train\\OverPower\\FileContoh.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName());
            } else {
                System.out.println("File gagal dibuat");
            }
        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}