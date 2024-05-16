package lesson_3.library;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name) {
        this(name, null, null);
    }

    public User(String name, String email) {
        this(name, email, null);
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
