package basicjava.homework7.task2;

public class Car {
    private String brand ;
    private String model ;
    private double fuelConsumption ;
    private double fuelTankCapacity ;
    private double     maxDistance ;


    public Car(String brand, String model, double fuelConsumption, double fuelTankCapacity, double maxDistance) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankCapacity = fuelTankCapacity;
        this.maxDistance = maxDistance;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
