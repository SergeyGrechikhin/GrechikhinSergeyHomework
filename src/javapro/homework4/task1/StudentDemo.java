package javapro.homework4.task1;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alex", "Java"));
        students.add(new Student("Max", "Java"));
        students.add(new Student("Boris", "Java"));
        students.add(new Student("Victor", "Java"));
        students.add(new Student("Petr", "Java"));

        System.out.println("My group");
        for (int i = students.size() -1 ; i >= 0 ; i--) {
            System.out.println(students.get(i));
        }

        students.remove(2);
        System.out.println("My new group");
        System.out.println(students);
    }
}
