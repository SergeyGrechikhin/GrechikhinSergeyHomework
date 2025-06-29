package javapro.teaproject.entity;

public class Tea {
    private int id;
    private Manufacturer manufacturer;
    private TypeOfTea type;
    private String variety;

    public Tea(int id, Manufacturer manufacturer, TypeOfTea type, String variety) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.type = type;
        this.variety = variety;
    }

    public TypeOfTea getType() {
        return type;
    }



    public int getId() {
        return id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return
                "Tea Variety : " + variety +
                        "\n Type : " + type.getTypeName() + " (" + type.getComment() + ") " +
                        "\n Manufacturer : " + manufacturer.getName() + " (" + manufacturer.getComment() + ") " +
                        "\n Id : " + id + "\n";
    }


}
