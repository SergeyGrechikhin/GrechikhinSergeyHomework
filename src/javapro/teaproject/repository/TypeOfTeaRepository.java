package javapro.teaproject.repository;

import com.sun.jdi.ArrayReference;
import javapro.teaproject.configuration.TypeOfTeaConfiguration;
import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.TypeOfTea;

import java.lang.reflect.Type;
import java.util.Arrays;

public class TypeOfTeaRepository {
    private TypeOfTea[] types;
    private int typesCounter;

    public TypeOfTeaRepository() {
        this.types = new TypeOfTea[TypeOfTeaConfiguration.TYPEOFTEACOUNTER];
        this.typesCounter = 0;
    }

    public void addTypeOfType(TypeOfTea[] newtypes){
        for (int i = 0; i <newtypes.length; i++) {
            if(typesCounter < newtypes.length){
                types[typesCounter++] = newtypes[i];
            }
        }
    }

    public TypeOfTea[] findAll() {
        return Arrays.copyOf(types, typesCounter);
    }

    public TypeOfTea findById(int id) {
        for (TypeOfTea typeOfTea : findAll()) {
            if (typeOfTea.getId() == id) {
                return typeOfTea;
            }
        }
        return null;
    }

    public TypeOfTea findByName(String name) {
        for (TypeOfTea typeOfTea : findAll()) {
            if (typeOfTea.getTypeName().equalsIgnoreCase(name)) {
                return typeOfTea;
            }
        }
        return null;
    }
}
