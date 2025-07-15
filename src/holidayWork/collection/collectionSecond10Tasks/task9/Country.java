package holidayWork.collection.collectionSecond10Tasks.task9;

import java.util.Objects;

public class Country implements Comparable<Country> {
    private String country;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(country);
    }

    @Override
    public int compareTo(Country o) {
        return this.country.compareTo(o.country);
    }
}
