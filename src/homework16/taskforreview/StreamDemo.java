package homework16.taskforreview;

public class StreamDemo {
    public static void main(String[] args) {
Student1 student1 = new Student1("1","Alex","Petrov");
        Student1 student2 = new Student1("2","Max","Iwanov");
        Student1 student3 = new Student1("3","Petr","Krasnov");
        Student1 student4 = new Student1("4","Egor","Vetrov");

        Student1[] firstteam = {student1,student2} ;
        Student1[] secondteam = {student3,student4} ;

        Group1 firstgroup = new Group1("First group",firstteam);
        Group1 secondgroup = new Group1("Second group",secondteam);

        Group1[] group1s = {firstgroup,secondgroup} ;

        Stream stream = new Stream("Java",group1s) ;

        System.out.println(stream);






    }
}
