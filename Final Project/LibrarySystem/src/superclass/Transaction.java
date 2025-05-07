package superclass;

public abstract class Transaction extends Entity {
    private Users user;
    private Media media;
    private String dateTransaction;

    public Transaction(int id, Users user, Media media, String dateTransaction){
        super(id);
        this.user = user;
        this.media = media;
        this.dateTransaction = dateTransaction;
    }
    public Users getUser() {
        return user;
    }
    public Media getMedia() {
        return media;
    }
    public String getDateTransaction() {
        return dateTransaction;
    }

    public abstract void execute();
}
class lending extends Transaction{
    public lending (int id, Users user, Media media, String dateTransaction){
        super(id, user, media, dateTransaction);
    }
    @Override
    public void execute() {
        System.out.println("Peminjaman oleh " + getUser().getName() + " pada tanggal " + getDateTransaction());
        getMedia().setAvailable(false);
    }
}

class returner extends Transaction{
    public returner(int id, Users user, Media media, String dateTransaction){
        super(id, user, media, dateTransaction);
    }
    @Override
    public void execute() {
        System.out.println("Pengembalian oleh " + getUser().getName() + " pada tanggal " + getDateTransaction());
        getMedia().setAvailable(false);
    }
}
