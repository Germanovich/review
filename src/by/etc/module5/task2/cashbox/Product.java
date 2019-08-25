package by.etc.module5.task2.cashbox;

public class Product {

    private static int idGeneration = 1;
    private int id = idGeneration++;
    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product: №%-5d product: %-10s price: %.2f$", getId(), getName(), getPrice());
    }
}
