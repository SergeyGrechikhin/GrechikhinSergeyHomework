package homeworkpractice.entity;

public class Task {
    private int id;
    private String TaskTitle ;
    private String TaskDescription ;
    private int TaskPriority;
    private boolean TaskStatus;

    public Task(int id, int taskPriority, boolean taskStatus, String taskDescription, String taskTitle) {
        this.id = id;
        TaskPriority = taskPriority;
        TaskStatus = taskStatus;
        TaskDescription = taskDescription;
        TaskTitle = taskTitle;
    }

    public int getId() {
        return id;
    }

    public String getTaskTitle() {
        return TaskTitle;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public int getTaskPriority() {
        return TaskPriority;
    }

    public boolean isTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        TaskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "\nTask" +
                "\nid=" + id +
                ", \nTaskTitle='" + TaskTitle + '\'' +
                ", \nTaskDescription='" + TaskDescription + '\'' +
                ", \nTaskPriority=" + TaskPriority +
                ", \nTaskStatus=" + TaskStatus +
                ", \n================= "
                ;
    }
}
