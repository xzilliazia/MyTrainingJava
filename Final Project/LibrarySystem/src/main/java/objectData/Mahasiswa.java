package objectData;
import masterClass.*;

public class Mahasiswa extends Users{
    private String major;

    public Mahasiswa(int id, String name, String username, String password, String major){
        super(id, name, username, password, major);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void info() {
        System.out.println("Mahasiswa: " + getName() + " Jurusan: " + major);
    }
}
