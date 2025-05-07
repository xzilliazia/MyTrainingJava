package superclass;

public abstract class Users extends Entity {
    private String name;
    private String typeAccount;

    public Users(int id, String name, String typeAccount){
        super(id);
        this.name = name;
        this.typeAccount = typeAccount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeAccount() {
        return typeAccount;
    }
    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }
    
    public abstract void info();
}