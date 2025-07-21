package holidayWork.miniProject.firstProject.entity;

import java.util.ArrayList;
import java.util.List;

public class Gruppe {
    private String courseName;
    private List<Student> students;

    public Gruppe(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Gruppe{" +
                "courseName='" + courseName
                ;
    }
}
