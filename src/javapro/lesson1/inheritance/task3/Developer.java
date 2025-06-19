package javapro.lesson1.inheritance.task3;

public class Developer extends Employee {
    private String[] projects;

    public Developer(String name, int age, String[] projects) {
        super(name, age);
        this.projects = projects;
    }
    public void printProjects(){
        System.out.println("Projects: ");
        for(int i=0;i<projects.length;i++){
            System.out.println(projects[i]);
        }
    }
}
