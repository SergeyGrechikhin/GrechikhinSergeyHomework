package javapro.teaproject.repository;

import javapro.teaproject.configuration.TeaConfiguration;
import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.Tea;
import javapro.teaproject.entity.TypeOfTea;

import java.util.Arrays;

public class TeaRepository {
    private Tea[] teas;
    private int teascounter;

    public TeaRepository() {
        this.teas = new Tea[TeaConfiguration.teaCounter] ;
        this.teascounter = 0;
    }

    public void addTea(Tea[] tea){
        for (int i = 0; i < tea.length; i++) {
            if(teascounter < tea.length){
                teas[teascounter++] = tea[i];
            }
        }
    }

    public Tea[] findAll() {
        return Arrays.copyOf(teas, teascounter);
    }

    public Tea[] findByManufacturer(Manufacturer manufacturer) {
        int counter = 0;
        for (Tea tea : findAll()) {
            if (tea.getManufacturer().equals(manufacturer)) {
                counter++;
            }
        }
        Tea[] teas = new Tea[counter];
        int index = 0;
        for (Tea tea : findAll()) {
            if (tea.getManufacturer().equals(manufacturer)) {
                teas[index++] = tea;
            }
        }
        return teas;
    }

    public Tea[] findByTypeOfTea(TypeOfTea typeOfTea) {
        int counter = 0;
        for (Tea tea : findAll()) {
            if (tea.getType().equals(typeOfTea)) {
                counter++;
            }
        }
        Tea[] teas = new Tea[counter];
        int index = 0;
        for (Tea tea : findAll()) {
            if (tea.getType().equals(typeOfTea)) {
                teas[index++] = tea;
            }
        }
        return teas;
    }


}
