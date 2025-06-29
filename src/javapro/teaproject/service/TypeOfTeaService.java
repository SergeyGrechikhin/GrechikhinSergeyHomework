package javapro.teaproject.service;

import javapro.teaproject.entity.TypeOfTea;
import javapro.teaproject.repository.TypeOfTeaRepository;

import java.lang.reflect.Type;

public class TypeOfTeaService {
private TypeOfTeaRepository typeOfTeaRepository;

    public TypeOfTeaService(TypeOfTeaRepository typeOfTeaRepository) {
        this.typeOfTeaRepository = typeOfTeaRepository;
    }

    public void addTypeOfTeaToDatabase(){
        TypeOfTea[] allType = {
                new TypeOfTea(0,"Green","Healthy"),
                new TypeOfTea(1,"Black","Fresh"),
        };
        typeOfTeaRepository.addTypeOfType(allType);
    }

    public TypeOfTea[] getAllTypeOfTea(){
        return typeOfTeaRepository.findAll();
    }

    public TypeOfTea getTypeOfTeaById(int id){
        return typeOfTeaRepository.findById(id);
    }

    public TypeOfTea getTypeOfTeaByName(String name){
        return typeOfTeaRepository.findByName(name);
    }
}
