package javapro.homework5.summarupro2.studentmanager;

import java.util.HashMap;

public class StudentManager {
    private HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(int id, String name ){
        students.put(id, new Student(id,name));
    }

    public void addGrade(int id, int grade , String subject) {
        Student student = students.get(id);
        if(student != null){
            student.addGrade(subject, grade);
        } else  {
            System.out.println("Student not found");
        }
    }
    public Student getStudent(int id){
        return students.get(id);
    }

    public double getAverageGrade(int id){
        HashMap<String , Integer> grades = students.get(id).getGrades();
        if(grades.size() == 0){
            return 0;
        }
        int sum = 0;
        for(int grade : grades.values()) {
            sum += grade;
        }
        return sum / (double)grades.size();
    }
}
