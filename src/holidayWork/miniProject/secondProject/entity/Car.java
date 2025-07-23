package holidayWork.miniProject.secondProject.entity;

public class Car {
    private String brand ;
    private String model ;
    private int year ;
    private double price ;
    private double rating ;
    private String vin ;

    public Car(String brand, String vin, double rating, double price, int year, String model) {
        this.brand = brand;
        this.vin = vin;
        this.rating = rating;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getVin() {
        return vin;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rating=" + rating +
                ", vin='" + vin + '\'' +
                '}';
    }
}
