package javapro.homework14.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTask4Demo {
    public static void main(String[] args) {
        List<StudentTask4> list = new ArrayList<>();
        list.add(new StudentTask4("Max",10,2025));
        list.add(new StudentTask4("Andy",9,2023));
        list.add(new StudentTask4("Alex",4,2024));
        list.add(new StudentTask4("Olga",5,2021));
        list.add(new StudentTask4("Fedor",6,2022));

        List<StudentTask4> list2 = list.stream().filter(s -> s.getAvgGrade() > 8).collect(Collectors.toList());
        System.out.println("Ученики с самыми высокими оценками : " + list2);

        List<StudentTask4> list3 = list.stream().sorted(Comparator.comparing(StudentTask4::getYear)).collect(Collectors.toList());
        System.out.println("Cортировка по году поступления  : " + list3);
    }
}
