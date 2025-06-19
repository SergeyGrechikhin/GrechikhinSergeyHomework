package javapro.lesson1.inheritance.task3;

public class AppDemo {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Max",24,new String[] {"Java Projects" , "Python Projects"  });
        Developer developer2 = new Developer("Anna",29,new String[] {"Main Project" , " C++ Projects"  });
        Employee[] teamdeveloper = {developer1,developer2};
        Manager manager = new Manager("Alex",40,teamdeveloper);
        manager.printInfo();
        manager.printTeam();
        System.out.println("============");
        developer1.printInfo();
        developer1.printProjects();
        System.out.println("============");
        developer2.printInfo();
        developer2.printProjects();
    }
}
