package holidayWork.miniProject.firstProject;

import holidayWork.miniProject.firstProject.repository.GruppeRepository;
import holidayWork.miniProject.firstProject.repository.StudentRepository;
import holidayWork.miniProject.firstProject.service.GruppeService;
import holidayWork.miniProject.firstProject.service.StudentService;
import holidayWork.miniProject.firstProject.ui.UI;

public class App {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        GruppeRepository gruppeRepository = new GruppeRepository();

        StudentService studentService = new StudentService(studentRepository);
        GruppeService gruppeService = new GruppeService(gruppeRepository,studentRepository);

        UI ui = new UI(studentService,gruppeService);
        ui.menu();
    }



}
