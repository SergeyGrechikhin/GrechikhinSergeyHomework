package javapro.lesson1.inheritance.task1;

public class Bicycle extends Car {
    private String material ;

    public Bicycle(String type, String color, boolean isNeedBenzine, String material) {
        super(type, color, isNeedBenzine);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void Peculiarities(String message) {
        super.Peculiarities(message);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "material='" + material + '\'' +
                '}';
    }
}
