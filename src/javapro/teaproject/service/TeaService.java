package javapro.teaproject.service;

import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.Tea;
import javapro.teaproject.entity.TypeOfTea;
import javapro.teaproject.repository.ManufacturerRepository;
import javapro.teaproject.repository.TeaRepository;
import javapro.teaproject.repository.TypeOfTeaRepository;

public class TeaService {
    private TeaRepository teaRepository;
    private ManufacturerService manufacturerService;
    private TypeOfTeaService typeOfTeaService;

    public TeaService(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }


    public void addDataBase(Manufacturer[] manufacturers, TypeOfTea[] typeOfTeas) {

        Tea[] alltea = {
         new Tea(1,manufacturers[0],typeOfTeas[0],"Earl Grey"),
                new Tea(2,manufacturers[1],typeOfTeas[1],"Carcade"),
                new Tea(3,manufacturers[3],typeOfTeas[1],"Earl Green"),
                new Tea(4,manufacturers[2],typeOfTeas[0],"Gold"),
                new Tea(5,manufacturers[0],typeOfTeas[1],"Gold"),
                new Tea(6,manufacturers[1],typeOfTeas[0],"Flowers"),
                new Tea(9,manufacturers[2],typeOfTeas[1],"Earl Green"),
                new Tea(10,manufacturers[3],typeOfTeas[1],"Earl Green"),
        } ;
        teaRepository.addTea(alltea);
    }

    public Tea[] getAllTeas() {
        return teaRepository.findAll();
    }

    public Tea[] searchByType(TypeOfTea type) {
        return teaRepository.findByTypeOfTea(type);
    }

    public Tea[] searchByManufacturer(Manufacturer manufacturer) {
        return teaRepository.findByManufacturer(manufacturer);
    }
}

