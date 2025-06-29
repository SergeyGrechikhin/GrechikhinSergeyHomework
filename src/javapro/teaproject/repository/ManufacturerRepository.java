package javapro.teaproject.repository;

import javapro.teaproject.configuration.ManufacturerConfiguration;
import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.Tea;

import java.util.Arrays;

public class ManufacturerRepository {
    private Manufacturer[] manufacturers;
    private int mCounter;

    public ManufacturerRepository() {
        this.manufacturers = new  Manufacturer[ManufacturerConfiguration.MANUFACTURERCOUNTER];
        this.mCounter = 0;
    }

    public void addManufacturer(Manufacturer[] newmanufacturers){
        for (int i = 0; i < newmanufacturers.length; i++) {
            if(mCounter < newmanufacturers.length){
                manufacturers[mCounter++] = newmanufacturers[i];
            }
        }
    }

    public Manufacturer[] findAll() {
        return Arrays.copyOf(manufacturers, mCounter);
    }

    public Manufacturer findById(int id) {
        for (Manufacturer manufacturer : findAll()) {
            if ( manufacturer != null && manufacturer.getId() == id) {
                return manufacturer;
            }
        }
        return null;
    }

    public Manufacturer findByName(String name) {
        for (Manufacturer manufacturer : findAll()) {
            if ( manufacturer != null && manufacturer.getName().equalsIgnoreCase(name)) {
                return manufacturer;
            }
        }
        return null;
    }




}
