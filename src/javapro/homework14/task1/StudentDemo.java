package javapro.homework14.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Sergey",15,5));
        students.add(new Student("Jack",14,3));
        students.add(new Student("Max",16,5));

        List<Student> filterByDoubleAge = students.stream().filter(student -> student.getAvgGrade() > 4.5).toList();

        System.out.println( "Ученики у которых средняя оценка выше 4.5 " + filterByDoubleAge);


        List<Student> filterByAge = students.stream().sorted(Comparator.comparing(Student::getAge )).toList();
        List<Student> filterByAgeReverse = students.stream().sorted(Comparator.comparing(Student::getAge ).reversed()).toList();


        System.out.println("Сортировка по возрастанию в возврасте " + filterByAge);
        System.out.println("Cортировка по убыванию в возврасте "  + filterByAgeReverse);






    }
}

