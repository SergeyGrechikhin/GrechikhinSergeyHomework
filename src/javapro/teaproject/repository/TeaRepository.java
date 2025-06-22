package javapro.teaproject.repository;

import javapro.teaproject.TeaConfiguration;
import javapro.teaproject.entity.Tea;

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
    public Tea[] getAll(){
        Tea[] teaInfo = new Tea[teascounter];
        for (int i = 0; i < teascounter; i++) {
            teaInfo[i] = teas[i];
        }
        return teaInfo;
    }
    public Tea[] findByManufacturer(String manufacturer){
        int counter = 0;
        for (int i = 0; i < teascounter; i++) {
            if (teas[i].getManufacturer().getName().equalsIgnoreCase(manufacturer)) {
                counter++;
            }
        }
        Tea[] teaManufacturer = new Tea[counter];
        int teaIndex = 0;
        for (int i = 0; i < teascounter; i++) {
            if (teas[i].getManufacturer().getName().equalsIgnoreCase(manufacturer)) {
                teaManufacturer[teaIndex] = teas[i];
                teaIndex++;
            }
        }
        return teaManufacturer;
    }

    public Tea[] findBytypeTea(String typeTea){
        int typeCounter = 0;
        for (int i = 0; i < teascounter; i++) {
            if (teas[i].getType().getTypeName().equalsIgnoreCase(typeTea)) {
                typeCounter++;
            }
        }
        Tea[] teaType = new Tea[typeCounter];
        int teaTypeIndex = 0;
        for (int i = 0; i < teascounter; i++) {
            if (teas[i].getType().getTypeName().equalsIgnoreCase(typeTea)) {
                teaType[teaTypeIndex] = teas[i];
                teaTypeIndex++;
            }
        }
        return teaType;

    }

}
