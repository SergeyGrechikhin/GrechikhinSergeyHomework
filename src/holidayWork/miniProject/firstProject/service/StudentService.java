package holidayWork.miniProject.firstProject.service;

import holidayWork.miniProject.firstProject.dto.ResponseDTO;
import holidayWork.miniProject.firstProject.entity.Student;
import holidayWork.miniProject.firstProject.repository.StudentRepository;


import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseDTO<Student> create(String firstName, String lastName, String id) {
        if (studentRepository.existsById(id)) {
            return ResponseDTO.requestFalse(null,"Студент с таким ID существует");
        }
        Student student = new Student(firstName,id,lastName);
        studentRepository.save(student);
        return ResponseDTO.requestTrue(student,"Студент добавлен в базу данных");
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id) ;
    }
}
