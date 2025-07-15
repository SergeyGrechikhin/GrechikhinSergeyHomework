package holidayWork.collection.collectionSecond10Tasks.task4;

public class MyPriority implements Comparable<MyPriority> {
    private String taskname;
    private int priority ;

    public MyPriority(String taskname, int priority) {
        this.taskname = taskname;
        this.priority = priority;
    }

    public String getTaskname() {
        return taskname;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "MyPriority{" +
                "taskname='" + taskname + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(MyPriority o) {
        return Integer.compare(o.priority, this.getPriority());
    }
}
