package javapro.homework3;

import java.util.Objects;

public class Phone {
    private String manufacturer;
    private String model;

    public Phone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(manufacturer, phone.manufacturer) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model);
    }
}
