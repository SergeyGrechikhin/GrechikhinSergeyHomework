package javapro.summarupro2.studentmanager;

public class StudentDemo {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent(1,"Alice");
        sm.addStudent(2,"Stas");
        sm.addStudent(3,"Alex");
        sm.addGrade(1,80,"Math");
        sm.addGrade(1,90,"Computer");
        sm.addGrade(1,85,"Physics");
        sm.addGrade(2,60,"Math");
        sm.addGrade(2,55,"Computer");
        sm.addGrade(2,25,"Physics");
        sm.addGrade(3,90,"Math");
        sm.addGrade(3,73,"Computer");
        sm.addGrade(3,12,"Physics");
        System.out.println(sm.getStudent(1));
        System.out.println("Average Grade: "+sm.getAverageGrade(1));
        System.out.println(sm.getStudent(2));
        System.out.println("Average Grade: "+sm.getAverageGrade(2));
        System.out.println(sm.getStudent(3));
        System.out.println("Average Grade: "+sm.getAverageGrade(3));

    }
}
