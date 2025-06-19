package javapro.lesson1.inheritance.task1;

public class Vehicle {
private String type;
private String color;

    public Vehicle(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }



    public void Peculiarities(String message) {
    System.out.println(message);


}

}
