package basicjava.homeworkpractice.repository;

import basicjava.homeworkpractice.TaskConfiguration;
import basicjava.homeworkpractice.entity.Task;

import java.util.Arrays;

public class TaskRepository {
    private Task[] tasks ;
    private int taskCounter;

    public TaskRepository() {
        this.tasks = new Task[TaskConfiguration.taskCounter];
        this.taskCounter = 0;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public int getTaskCounter() {
        return taskCounter;
    }

    public boolean save(Task task) {
        if (taskCounter < tasks.length && tasks != null) {
            tasks[taskCounter++] = task;
            return true;
        }
        return false;
    }
    public Task findById(int IdForSearch){
        for (int i = 0; i < taskCounter; i++) {
            if (tasks[i] != null && tasks[i].getId() == IdForSearch) {
                return tasks[i];
            }
        }
        return null;
    }

    public Task[] findByPriority(int PriorityForSearch ){
       Task[] results = new Task[taskCounter];
       int index = 0;
       for( int i = 0; i < taskCounter; i++ ){
           if ( tasks[i] != null && tasks[i].getTaskPriority() == PriorityForSearch) {
               results[index++] = tasks[i];
           }
       }

       return Arrays.copyOf(results, index);
    }

    public  Task findByTaskTitle(String TaskTitle){
        for (int i = 0; i < taskCounter; i++) {
            if ( tasks[i] != null && tasks[i].getTaskTitle().equals(TaskTitle)) {
                return tasks[i];
            }
        }
        return null;
    }
    public Task[] findAllTask(){
        return Arrays.copyOf(tasks, taskCounter);
    }



    public boolean deleteById(int IdForSearch){
        for  (int i = 0; i < taskCounter; i++) {
            if ( tasks[i] != null && tasks[i].getId() == IdForSearch) {
                for (int j = 0; j < taskCounter; j++) {
                    tasks[j] = tasks[j+1];
                }
                tasks[taskCounter-1] = null;
                taskCounter--;
                return  true;
            }
        }
        return false;
    }











}
