package javapro.homework14.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTask5Demo {
    public static void main(String[] args) {
  List<StudentTask5> list = new ArrayList<>();

        list.add(new StudentTask5("Max","Студент 2 курс",2021));


        list.add(new StudentTask5("Max","Студент 2 курс",2021));

        list.add(new StudentTask5("Max","Студент 1 курс",2022));

        list.add(new StudentTask5("Max","Студент 1 курс",2022));

        list.add(new StudentTask5("Max","Студент 1 курс",2022));

        List<StudentTask5> list2 = list.stream().filter(s -> s.getYear() == 2021).collect(Collectors.toList());
        System.out.println("Студенты 2021 года" + list2);

        List<StudentTask5> list3 = list.stream().filter(s -> s.getYear() == 2022).collect(Collectors.toList());
        System.out.println("Студенты 2022 года" + list3);




    }
}
