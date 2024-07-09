public class User {
    private String name;
    private String id;
    private String pw;

    public User() {
    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return this.id;
    }

    public String getPw() {
        return this.pw;
    }

    public String getName() {
        return this.name;
    }
}