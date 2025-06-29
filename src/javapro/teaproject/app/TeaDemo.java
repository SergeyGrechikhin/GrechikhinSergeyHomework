package javapro.teaproject.app;

import javapro.teaproject.UI.UI;
import javapro.teaproject.repository.ManufacturerRepository;
import javapro.teaproject.repository.TeaRepository;
import javapro.teaproject.repository.TypeOfTeaRepository;
import javapro.teaproject.service.ManufacturerService;
import javapro.teaproject.service.TeaService;
import javapro.teaproject.service.TypeOfTeaService;

public class TeaDemo {
    public static void main(String[] args) {
        ManufacturerRepository manufacturerRepository = new ManufacturerRepository();
        TypeOfTeaRepository typeOfTeaRepository = new TypeOfTeaRepository();
        TeaRepository teaRepository = new TeaRepository();

        ManufacturerService manufacturerService = new ManufacturerService(manufacturerRepository);
        TypeOfTeaService typeOfTeaService = new TypeOfTeaService(typeOfTeaRepository);
        TeaService teaService = new TeaService(teaRepository);

        manufacturerService.addManufacturerToDataBase();
        typeOfTeaService.addTypeOfTeaToDatabase();

        teaService.addDataBase(manufacturerService.getAll(),typeOfTeaService.getAllTypeOfTea());

        UI ui = new UI(teaService,typeOfTeaService,manufacturerService);
        ui.printMenu();
    }
}
