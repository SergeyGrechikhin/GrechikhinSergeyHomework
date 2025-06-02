package homework16.taskforreview;

import java.util.Arrays;

public class Group1 {
    private String gruppename ;
    private Student1[] arraystudent;

    public Group1(String gruppename, Student1[] arraystudent) {
        this.gruppename = gruppename;
        this.arraystudent = arraystudent;
    }

    public Student1[] getArraystudent() {
        return arraystudent;
    }

    public String getGruppename() {
        return gruppename;
    }

    @Override
    public String toString() {
        return "Group1{" +
                "gruppename='" + gruppename + '\'' +
                ", arraystudent=" + Arrays.toString(arraystudent) +
                '}';
    }
}
