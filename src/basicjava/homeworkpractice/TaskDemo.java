package basicjava.homeworkpractice;

import basicjava.homeworkpractice.repository.TaskRepository;
import basicjava.homeworkpractice.service.TaskService;
import basicjava.homeworkpractice.ui.UI;

public class TaskDemo {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        UI ui = new UI(taskService);
        ui.UserMenu();
    }
}
