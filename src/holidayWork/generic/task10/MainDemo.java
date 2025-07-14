package holidayWork.generic.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Bob" , 45),
                new Person("Alex" , 47),
                new Person("Oleg",21)
        );

        System.out.println("Sort By Name");
        Sorter.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Sort by Age");
        for (Person person : personList) {
            System.out.println(person);
        }

        Sorter.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("Sort By Age");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
