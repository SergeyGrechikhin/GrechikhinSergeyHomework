package javapro.homework2.task3;

public class PrintHello implements Command {
    @Override
    public void execute() {
        System.out.println("Hello World");
    }
}
