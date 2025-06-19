package basicjava.homework4.task4;

public class Managerdemo {
    public static void main(String[] args) {
        //Задача № 4
        Manager konstantin = new Manager() ; //Работник Константин
        konstantin.age = 24 ; //Возвраст Константина
        konstantin.salary = 50000 ; // Зарплата Константина

        System.out.println("Возвраст работника Константина  : " + konstantin.age );
        System.out.println("Зарплата Константина : " + konstantin.salary );
        System.out.println("У Константина завтра будет день рождение ему исполнится : " + (konstantin.age + 1 ));
        System.out.println("В честь дня рождения ему выписана премия в размере 10000 . Зарплата в конце месяца составит : " + (konstantin.salary + 10000 ));

        Manager sasha = new Manager () ; // Работник Александр
        sasha.age = 42 ; // Возвраст Александра
        sasha.salary = 60000 ; // Зарплата Александра

        System.out.println("Возвраст работника Александра : " + sasha.age );
        System.out.println("Зарплата Александра : " + sasha.salary );
        System.out.println("У Александра было вчера день рождение ему испольнилось : " + (sasha.age + 1 ));
        System.out.println("Александр совершил ошибку в работе и получил штраф в размере 20000 . Зарплата в конце месяца составит : " + (sasha.salary - 20000 ));
    }
}
