package javapro.homework5.summarupro2.studentmanager;

import java.util.HashMap;

public class Student {
    private String name;
    private int id;
    private HashMap<String, Integer> grades;

    public Student(int id, String name) {
        this.grades = new HashMap<>();
        this.id = id;
        this.name = name;
    }

    public void addGrade(String name, int grade) {
        grades.put(name, grade);
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades +
                '}';
    }


}
