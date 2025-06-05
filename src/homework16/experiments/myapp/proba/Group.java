package homework16.experiments.myapp.proba;

public class Group {
    private String groupname;
    private Student[] students = new Student[10] ;
    private int studentCount = 0;

    public int getStudentCount() {
        return studentCount;
    }

    public Group(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public boolean addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            return true ;
        } else {

            return false;
        }
    }

    public Student[] getStudents() {
        return students;
    }
}
