package superclass;

public abstract class Media extends Entity {
    private String title;
    private boolean available;
    
    public Media(int id, String title, boolean available){
        super(id);
        this.title = title;
        this.available = available;
    }
    // public int getId(){
    //     return id;
    // }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public abstract void info();
}