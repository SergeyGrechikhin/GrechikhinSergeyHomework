package basicjava.homework8.task2.var1;

public class Phone {
    String model ;
    String color ;
    boolean isSilent ;

    public Phone(String model, String color, boolean isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    public String getModel() {
        return model;
    }

    public boolean isSilent() {
        return isSilent;
    }

    public String getColor() {
        return color;
    }

    public void setSilent(boolean silent) {
        isSilent = silent;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", isSilent=" + isSilent +
                '}';
    }
}
