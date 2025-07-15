package holidayWork.collection.collectionSecond10Tasks.task3;

public class Person {
    private String Name;
    private int age ;

    public String getName() {
        return Name;
    }



    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
