package holidayWork.miniProject.firstProject.service;

import holidayWork.miniProject.firstProject.dto.ResponseDTO;
import holidayWork.miniProject.firstProject.entity.Gruppe;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.firstProject.repository.GruppeRepository;
import holidayWork.miniProject.firstProject.repository.StudentRepository;

import java.util.List;


public class GruppeService {
    private final GruppeRepository  gruppeRepository;
    private final StudentRepository studentRepository;

    public GruppeService(GruppeRepository gruppeRepository, StudentRepository studentRepository) {
        this.gruppeRepository = gruppeRepository;
        this.studentRepository = studentRepository;
    }

    public ResponseDTO<Gruppe> createGruppe(String name) {
        if (gruppeRepository.exists(name)) {
            return ResponseDTO.requestFalse(null,"Курс уже существует");
        }
        Gruppe gruppe = new Gruppe(name);
        gruppeRepository.save(gruppe);
        return ResponseDTO.requestTrue(null,"Курс создан");
    }

    public ResponseDTO<?> addStudentToGruppe(String studentId, String gruppeName) {
        Student student = studentRepository.findById(studentId);
        if (student == null) {
            return ResponseDTO.requestFalse(null,"Студент не найден");
        }
        Gruppe gruppe = gruppeRepository.findByName(gruppeName);
        if (gruppe == null) {
            return ResponseDTO.requestFalse(null,"Группа не найдена");
        }
        gruppe.addStudent(student);
        return  ResponseDTO.requestTrue(null,"Студент успешно добавлен");
    }
    public List<Gruppe> getAllGruppe() {
        return gruppeRepository.findAll();
    }
}
