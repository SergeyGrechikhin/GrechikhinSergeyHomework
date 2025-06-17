package homeworkpractice.ui;

import homeworkpractice.TaskConfiguration;
import homeworkpractice.entity.Task;
import homeworkpractice.service.TaskService;

import java.util.Scanner;

public class UI {
    private TaskService taskService;
    Scanner input = new Scanner(System.in);

    public UI(TaskService taskService) {
        this.taskService = taskService;
    }

    public void createMyTasks() {
        System.out.println("Enter how many tasks you want to add to the database");
        int taskscounter = input.nextInt();
        input.nextLine();
        int count = taskService.getTasksCounter();
        int maxcount = TaskConfiguration.taskCounter;
        int freecount = maxcount - count;

        if (taskscounter > freecount) {
            System.out.println("You can't add so many tasks. Exceeds the total number of available spaces.");
            System.out.println("Max Slots : " + freecount);
        } else {
            for (int i = 0; i < taskscounter; i++) {
                count = taskService.getTasksCounter();
                maxcount = TaskConfiguration.taskCounter;
                freecount = maxcount - count;

                if (freecount <= 0) {
                    System.out.println("The storage is full !");
                    break;
                }
                System.out.println("Free Slots " + freecount);
                System.out.println("Enter Task title");
                String taskTitle = input.nextLine();
                System.out.println("Enter Task description");
                String taskDescription = input.nextLine();
                System.out.println("Enter product ID/OnlyINT");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Enter Task Priority/OnlyInt (Priority 1 - 10 ) ");
                int priority = input.nextInt();
                input.nextLine();


                Task[] savedTask = taskService.createTask(id, priority, false, taskDescription, taskTitle);
                if (savedTask != null) {
                    System.out.println("Task added successfully");
                } else {
                    System.out.println("Task not added successfully");
                }

            }
        }
    }

    private void printInfoforFindtoId() {
        System.out.println("Enter the ID by which you want to find the task");
        int id = input.nextInt();
        input.nextLine();
        Task foundIdTask = taskService.findById(id);
        if (foundIdTask != null) {
            System.out.println("Your Task " + foundIdTask);
        } else {
            System.out.println("Your Task not found");
        }
    }

    private void printInfoforFindTaskTitle() {
        System.out.println("Enter the task title by which you want to find the task");
        String title = input.nextLine();
        Task foundTitleTask = taskService.findByTaskTitle(title);
        if (foundTitleTask != null) {
            System.out.println("Your Task " + foundTitleTask);
        } else {
            System.out.println("Your Task not found");
        }
    }

    public void printInfo() {
        Task[] tasks = taskService.getAllTasks();
        if (tasks.length == 0) {
            System.out.println("Tasks not added to the catalog yet ");
            return;
        }
        System.out.println(" Info : ");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                return;
            }
            System.out.println(tasks[i]);
        }
    }

    public void printSortedTasks() {
        Task[] sortedtasks = taskService.getTasksSortedByPriority();
        if (sortedtasks.length == 0) {
            System.out.println("Tasks not added to the catalog yet ");
        } else {
            System.out.println("Sorted Tasks : ");
            for (int i = 0; i < sortedtasks.length; i++) {
                if (sortedtasks[i] != null) {
                    System.out.println(sortedtasks[i]);
                }
            }
        }

    }

    public void ChangeStatus() {
        System.out.println("Enter the task id whose status you want to change");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Enter new status(True/False)");
        boolean status = input.nextBoolean();
        input.nextLine();
        boolean laststatus = taskService.updateTask(id, status);
        if (laststatus == true) {
            System.out.println("Task status updated successfully");
        } else {
            System.out.println("Task status updated failed");
        }
    }

    public void printInfoByPriority() {
        System.out.println("Enter your priority /Only Int (1-10)");
        int priority = input.nextInt();
        input.nextLine();
        Task[] foundMyPriority = taskService.getTaskPriority(priority);
        if (foundMyPriority.length == 0) {
            System.out.println("Tasks with this priority not found");
        } else {
            System.out.println("Tasks : ");
            for (int i = 0; i < foundMyPriority.length; i++) {
                if (foundMyPriority[i] != null) {
                    System.out.println(foundMyPriority[i]);
                }
            }
        }
    }

    public void ExtraMenu() {
        while (true) {
            System.out.println("===*Search Task*===");
            System.out.println("1. Find by ID");
            System.out.println("2. Find by Title");
            System.out.println("3.Find by Priority");
            System.out.println("4. Back to Main Menu");
            String userextrachoice = input.nextLine();
            switch (userextrachoice) {
                case "1":
                    printInfoforFindTaskTitle();
                    break;
                    case "2":
                        printInfoforFindTaskTitle();
                        break;
                        case "3":
                            printInfoByPriority();
                            break;
                            case "4":
                                UserMenu();
                                break;
                                default:
                                    System.out.println("Error");

            }
        }
    }


    public void UserMenu() {
        while (true) {
            System.out.println(" ===*Menu*=== ");
            System.out.println("1. Add task/tasks to the database.");
            System.out.println("2. Find a task in the database. ");
            System.out.println("3. Sort tasks by priority");
            System.out.println("4. Info about all tasks.");
            System.out.println("5. Change status of a task");
            System.out.println("0. Exit.");

            String userChoice = input.nextLine();
            switch (userChoice) {
                case "1":
                    createMyTasks();
                    break;

                case "2":
                    ExtraMenu();
                    break;
                case "3":
                    printSortedTasks();
                    break;
                case "4":
                    printInfo();
                    break;
                case "5":
                    ChangeStatus();
                    break;
                case "0":
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Error");
            }


            }

        }
    }


