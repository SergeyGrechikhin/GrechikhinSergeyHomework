package homework16.forthefuture;

import java.util.Arrays;

public class Institute {
    private Group[] groups;
    private Student[] students;

    public Institute(Group[] groups, Student[] students) {
        this.groups = groups;
        this.students = students;
    }

    public Group[] getGroups() {
        return groups;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "groups=" + Arrays.toString(groups) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
