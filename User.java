public class User {
    private String name;
    private boolean registered;

    public User(String name, boolean registered) {
        this.name = name;
        this.registered = registered;
    }

    public String getName() {
        return name;
    }

    public boolean isRegistered() {
        return registered;
    }
}