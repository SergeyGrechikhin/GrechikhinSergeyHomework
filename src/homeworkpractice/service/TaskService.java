package homeworkpractice.service;

import homework22.entity.Product;
import homeworkpractice.entity.Task;
import homeworkpractice.repository.TaskRepository;

public class TaskService {
    private TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public Task[] createTask(int id, int taskPriority, boolean taskStatus, String taskDescription, String taskTitle){
        if (taskTitle == null || taskTitle.isBlank() || taskDescription == null || taskDescription.isBlank()) {
            System.out.println("Task Title or TaskDescription is null or blank");
            return null;
        }
        if (taskRepository.findById(id) != null) {
            System.out.println("Task with this ID already exists!");
            return null;
        }
        if (taskRepository.findByTaskTitle(taskTitle) != null) {
            System.out.println("Task with this title already exists!");
            return null;
        }
        Task task = new Task(id,taskPriority,taskStatus,taskDescription,taskTitle);
        taskRepository.save(task);
        return new Task[]{task};
    }

    public Task findById(int id) {
        return taskRepository.findById(id);
    }

    public Task findByTaskTitle(String taskTitle) {
        return taskRepository.findByTaskTitle(taskTitle);
    }
    public Task[] getAllTasks() {
        return taskRepository.findAllTask();
    }

    public boolean updateTask(int id,boolean newStatus) {
        Task task = taskRepository.findById(id);
        if (task != null) {
            task.setTaskStatus(newStatus);
            return true;
        }
        return false;
    }

    public Task[] getTasksSortedByPriority() {
        Task[] tasks = taskRepository.findAllTask();
        for (int i = 0; i < tasks.length; i++) {
            for (int j = i + 1; j < tasks.length; j++) {
                if (tasks[i].getTaskPriority() > tasks[j].getTaskPriority()) {
                    Task temp = tasks[i];
                    tasks[i] = tasks[j];
                    tasks[j] = temp;
                }
            }
        }
        return tasks;
    }

    public int  getTasksCounter() {
        return taskRepository.getTaskCounter();
    }

    public Task[] getTaskPriority(int myPriority) {
        return taskRepository.findByPriority(myPriority);
    }



}


