package basicjava.homework13.task1;

public class Car {
    private String producer;
    private String model;
    private int power;

    public Car(String producer, int power, String model) {
        this.producer = producer;
        this.power = power;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
