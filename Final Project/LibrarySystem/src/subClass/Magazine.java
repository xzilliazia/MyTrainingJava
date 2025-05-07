package subClass;

import superclass.Media;

public class Magazine extends Media{
    private String edisi; 

    public Magazine(int id, String title, boolean available, String edisi){
        super(id, title, available);
        this.edisi = edisi;
    }

    @Override
    public void info() {
        System.out.println("Majalah: "+ getTitle() + "\nEdisi: "+ edisi);
    }
}
