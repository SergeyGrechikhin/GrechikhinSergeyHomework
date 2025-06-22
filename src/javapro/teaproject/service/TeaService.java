package javapro.teaproject.service;

import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.entity.Tea;
import javapro.teaproject.entity.TypeOfTea;
import javapro.teaproject.repository.TeaRepository;

public class TeaService {
    private TeaRepository teaRepository;

    public TeaService(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    public void addDataBase() {
        Manufacturer manufacturer1 = new Manufacturer(0,"Ahmad","New Brand");
        Manufacturer manufacturer2 = new Manufacturer(1,"Maxi","EU Brand");
        Manufacturer manufacturer3 = new Manufacturer(2,"Tetley Tea","EU Brand");
        Manufacturer manufacturer4 = new Manufacturer(3,"Greenfield.","EU Brand");

        TypeOfTea typeOfTea1 = new TypeOfTea(0,"Black","Healthy");
        TypeOfTea typeOfTea2 = new TypeOfTea(1,"Green","Fresh");
        Tea[] alltea = {
                new Tea(1,manufacturer1,typeOfTea1,"Earl Grei"),
       new Tea(2,manufacturer2,typeOfTea2,"Carcade"),
        new Tea(3,manufacturer1,typeOfTea2,"Matcha"),
         new Tea(4,manufacturer3,typeOfTea1,"Flowers"), new Tea(5,manufacturer4,typeOfTea2,"Gold"),
        } ;


        teaRepository.addTea(alltea);


    }

    public Tea[] getAllTeas() {
        return teaRepository.getAll();
    }

    public Tea[] searchByType(String type) {
        return teaRepository.findBytypeTea(type);
    }

    public Tea[] searchByManufacturer(String manufacturer) {
        return teaRepository.findByManufacturer(manufacturer);
    }
}

