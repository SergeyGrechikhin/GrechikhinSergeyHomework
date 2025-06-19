package basicjava.homework8.task2.var2;

public class Handy {
    String model ;
    String color ;
    boolean isSilent ;

    public Handy(String model, String color, boolean isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isSilent() {
        return isSilent;
    }

    public void setSilent(boolean silent) {
        isSilent = silent;
    }

    @Override
    public String toString() {
        return "Handy{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", isSilent=" + isSilent +
                '}';
    }
}
