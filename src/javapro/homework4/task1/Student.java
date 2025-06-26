package javapro.homework4.task1;

import java.util.Objects;

public class Student {
    private String name;
    private String group;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
