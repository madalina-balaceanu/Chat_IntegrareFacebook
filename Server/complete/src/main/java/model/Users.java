package hello;

public class Users {

    private final long id;
    private final String name;

    public Users(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
