package homeworkpractice;

import homeworkpractice.repository.TaskRepository;
import homeworkpractice.service.TaskService;
import homeworkpractice.ui.UI;

public class TaskDemo {
    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        UI ui = new UI(taskService);
        ui.UserMenu();
    }
}
