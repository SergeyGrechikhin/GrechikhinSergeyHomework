package javapro.homework2.task3;

public class CommandService {
    public void runAll(Command[] commands) {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
