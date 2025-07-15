package holidayWork.collection.collectionSecond10Tasks.task3;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class PersonDemo {
    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();
        personList.push(new Person("Oleg", 32));
        personList.push(new Person("Max", 19));
        personList.push(new Person("Jack", 35));

        LinkedList<Person> personList1 = new LinkedList<>();
        personList1.push(new Person("Olga", 35));
        personList1.push(new Person("Victor", 19));
        personList1.push(new Person("Stas", 34));


        Set<Person> personSet = new LinkedHashSet<>();
        personSet.addAll(personList);
        personSet.addAll(personList1);



        for(Person person: personSet ){
            if (person.getAge() < 30)
                System.out.println(person);
        }


    }
}
