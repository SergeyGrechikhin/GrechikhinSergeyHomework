package homework9;

public class Car {
    private String model;
    private Prodcar producer ;
    private  String color ;

    public Car(String model, String color, Prodcar producer) {
        this.model = model;
        this.color = color;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public Prodcar getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", color='" + color + '\'' +
                '}';
    }
}
