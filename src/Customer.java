public class Customer {
    private int id;
    private String name;
    private String type;

    public Customer(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getType() {
        return type;
    }
}
