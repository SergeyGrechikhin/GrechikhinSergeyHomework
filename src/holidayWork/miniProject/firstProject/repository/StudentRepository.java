package holidayWork.miniProject.firstProject.repository;

import holidayWork.miniProject.firstProject.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {
    private final Map<String, Student> students = new HashMap<>();

    public void save(Student student) {
        students.put(student.getId(),  student);
    }

    public Student findById(String id) {
        return students.get(id);
    }

    public boolean existsById(String id) {
        return students.containsKey(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}
