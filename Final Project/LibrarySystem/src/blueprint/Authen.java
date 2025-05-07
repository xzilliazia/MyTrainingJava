package blueprint;

public interface Authen {
    boolean login(String username, String password);
    void logout();
}
