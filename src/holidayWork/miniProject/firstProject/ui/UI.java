package holidayWork.miniProject.firstProject.ui;

import holidayWork.miniProject.firstProject.dto.ResponseDTO;
import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.firstProject.service.GruppeService;
import holidayWork.miniProject.firstProject.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class UI {
    private final StudentService studentService;
    private final GruppeService gruppeService;
    private final Scanner scanner = new Scanner(System.in);

    public UI(StudentService studentService, GruppeService gruppeService) {
        this.studentService = studentService;
        this.gruppeService = gruppeService;
    }

    private void createGruppe() {
        System.out.println("Название группы");
        String name = scanner.nextLine();
        ResponseDTO<?> responseDTO = gruppeService.createGruppe(name);
        System.out.println(responseDTO.getMessage());
    }

    private void createStudent() {
        System.out.println("ID студента");
        String id = scanner.nextLine();
        System.out.println("Имя");
        String firstName = scanner.nextLine();
        System.out.println("Фамилия");
        String lastName = scanner.nextLine();
        ResponseDTO<?> responseDTO = studentService.create(firstName,lastName,id);
        System.out.println(responseDTO.getMessage());
    }

    private void studentToGruppe() {
        System.out.println("ID Студента");
        String id = scanner.nextLine();
        System.out.println("Название группы");
        String gruppeName = scanner.nextLine();
        ResponseDTO<?> responseDTO = gruppeService.addStudentToGruppe(id,gruppeName);
        System.out.println(responseDTO.getMessage());
    }

    private void showStudent() {
        List<Student> students = studentService.findAll();
        if (students.isEmpty()) {
            System.out.println("Cтудентов нет");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void showGruppe() {
        List<Gruppe> gruppes = gruppeService.getAllGruppe();
        if (gruppes.isEmpty()) {
            System.out.println("Нет курсов");
            return;
        }
        for (Gruppe gruppe : gruppes) {
            System.out.println(gruppe);
            for (Student student : gruppe.getStudents()) {
                System.out.println(student);
            }
        }
    }

    public void menu(){
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Добавить студента");
            System.out.println("2.Добавить группы");
            System.out.println("3.Перевест студента в группу");
            System.out.println("4.Показать всех студентов");
            System.out.println("5.Показать все группы");
            System.out.println("0.Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> createStudent();
                case "2" -> createGruppe();
                case "3" -> studentToGruppe();
                case "4" -> showStudent();
                case "5" -> showGruppe();
                case "0" ->{
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Неверный ввод");

            }

        }
    }
}
