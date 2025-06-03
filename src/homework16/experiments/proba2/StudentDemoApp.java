package homework16.experiments.proba2;

public class StudentDemoApp {
    public static void main(String[] args) {
        GroupService groupService = new GroupService();
        Group[] groups = groupService.createArrayGroup();
        StudentService studentService = new StudentService() ;
        Student[] student = studentService.createArrayStudent() ;
        Institute institute = new Institute(groups,student);
        System.out.println(institute);
    }
}
