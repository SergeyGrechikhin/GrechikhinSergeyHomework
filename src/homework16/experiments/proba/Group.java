package homework16.experiments.proba;

public class Group {
    private String groupname;
    private Student[] students = new Student[100] ;
    private int studentCount = 0;

    public Group(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Группа заполнена");
        }
    }

    public Student[] getStudents() {
        return students;
    }
}
