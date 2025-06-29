package javapro.teaproject.service;

import javapro.teaproject.entity.Manufacturer;
import javapro.teaproject.repository.ManufacturerRepository;
import javapro.teaproject.repository.TeaRepository;

public class ManufacturerService {
    private ManufacturerRepository manufacturerRepository;

    public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    public void addManufacturerToDataBase() {
        Manufacturer[] all = {
                new Manufacturer(0,"Ahmad","New Brand"),
                new Manufacturer(1,"Maxi","EU Brand"),
                new Manufacturer(2,"Greenfield","EU Brand"),
                new Manufacturer(3,"Tetley","EU Brand"),
        };
        manufacturerRepository.addManufacturer(all);
    }

    public Manufacturer getManufacturerById(int id) {
        return manufacturerRepository.findById(id);
    }

    public Manufacturer getManufacturerByName(String name) {
        return manufacturerRepository.findByName(name);
    }

    public Manufacturer[] getAll() {
        return manufacturerRepository.findAll();
    }
}
