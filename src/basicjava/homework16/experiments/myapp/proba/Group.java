package basicjava.homework16.experiments.myapp.proba;

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

    public void removeStudent(Student student) {
        if (student == null) {
            System.out.println("Ошибка.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getId().equalsIgnoreCase(student.getId())) {
               Student myremoveStudent = students[i];
                for (int j = i; j < studentCount -1 ; j++) {
                    students[j] = students[j+1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Студент " + myremoveStudent.getName() + " " + myremoveStudent.getSurname() + " удален из группы " + groupname);
                return;
            }
        }

    }
}
