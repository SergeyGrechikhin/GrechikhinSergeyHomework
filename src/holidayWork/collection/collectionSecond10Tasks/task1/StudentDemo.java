package holidayWork.collection.collectionSecond10Tasks.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Max",5));
        students.add(new Student("Stas",4));
        students.add(new Student("Petr",3));
       students.sort((a , b ) -> b.getGrade() - a.getGrade() );
      for (Student student : students) {
          System.out.println(student.getName() + student.getGrade());
      }
    }
}
