package javapro.lesson1.inheritance.task3;

public class Manager extends Employee {
    private Employee[] employees;

    public Manager(String name, int age, Employee[] employees) {
        super(name, age);
        this.employees = employees;
    }
    public void printTeam(){
        System.out.println("Subordinates");
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
    }
}
