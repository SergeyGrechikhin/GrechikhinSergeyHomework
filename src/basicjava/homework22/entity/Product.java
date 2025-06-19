package basicjava.homework22.entity;

public class Product {
    private String producer;
    private String productName;
    private int id;
    private double price;

    public Product(String producer, double price, int id, String productName) {
        this.producer = producer;
        this.price = price;
        this.id = id;
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", productName='" + productName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
