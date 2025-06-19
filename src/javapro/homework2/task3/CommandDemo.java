package javapro.homework2.task3;

import javax.swing.*;

public class CommandDemo {
    public static void main(String[] args) {
        Command[] commands = {
                new PrintHello(),new PrintDate(),new PrintBye()
        };
        CommandService commandService = new CommandService();
        commandService.runAll(commands);
    }
}
