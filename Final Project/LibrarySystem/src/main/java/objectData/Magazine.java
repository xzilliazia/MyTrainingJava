package objectData;

import masterClass.*;

public class Magazine extends Media{
    private String edition; 

    public Magazine(int id, String title, boolean available, String edition){
        super(id, title, available);
        if (edisi == null || edisi.trim().isEmpty()) {
            throw new IllegalArgumentException("Edisi tidak boleh kosong");
        }
        this.edition = edition;
    }
    @Override
    public String toString() {
        return "Magazine{" +
            "id=" + getId() +
            ", title='" + getTitle() + '\'' +
            ", available=" + isAvailable() +
            ", edisi='" + edisi + '\'' +
            '}';
}

    @Override
    public void info() {
        System.out.println("Majalah: "+ getTitle() + "\nedisi: "+ edition);
    }
}
