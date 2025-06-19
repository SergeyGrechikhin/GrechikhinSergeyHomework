package basicjava.homework9;

public class Prodcar {
    private String description ;
    private String country ;

    public Prodcar(String description, String country) {
        this.description = description;
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "ProdCar{" +
                "description='" + description + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
