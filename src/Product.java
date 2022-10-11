public class Product {
    private String name;
    private int price;
    private int numberInStock;

    public Product() {
    }

    public Product(String name, int price, int numberInStock) {
        this.name = name;
        this.price = price;
        this.numberInStock = numberInStock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberInStock() {
        return numberInStock;
    }
}
