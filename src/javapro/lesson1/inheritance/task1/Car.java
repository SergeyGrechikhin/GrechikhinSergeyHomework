package javapro.lesson1.inheritance.task1;

public class Car extends Vehicle{

    private boolean isNeedBenzine ;

    public Car(String type, String color, boolean isNeedBenzine) {
        super(type, color);
        this.isNeedBenzine = isNeedBenzine;
    }

    public void setNeedBenzine(boolean needBenzine) {
        isNeedBenzine = needBenzine;
    }

    @Override
    public void Peculiarities(String message) {
        super.Peculiarities(message);
    }

    @Override
    public String toString() {
        return "Car{" +
                "isNeedBenzine=" + isNeedBenzine +
                '}';
    }
}
