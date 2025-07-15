package holidayWork.collection.collectionSecond10Tasks.task7;

import java.util.List;

public class Task {
    private List<String> taskName;

    public Task(List<String> taskName) {
        this.taskName = taskName;
    }

    public List<String> getTaskName() {
        return taskName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName=" + taskName +
                '}';
    }
}
