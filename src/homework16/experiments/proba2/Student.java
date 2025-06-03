package homework16.experiments.proba2;

public class Student {
    private String name ;
    private String surname ;
    private String studentid ;

    public Student(String name, String studentid, String surname) {
        this.name = name;
        this.studentid = studentid;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentid='" + studentid + '\'' +
                '}';
    }
}
