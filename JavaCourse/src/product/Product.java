package product;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
