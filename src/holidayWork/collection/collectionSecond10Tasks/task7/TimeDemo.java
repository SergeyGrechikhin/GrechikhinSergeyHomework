package holidayWork.collection.collectionSecond10Tasks.task7;

import java.util.*;

public class TimeDemo {
    public static void main(String[] args) {
        LinkedHashMap<Time , Task> test = new LinkedHashMap<>();
        List<String> taskName = new ArrayList<>();
        taskName.add("Java");
        taskName.add("Work");
        List<String> taskName2 = new ArrayList<>();
        taskName2.add("Go to Home");
        taskName2.add("Relax");
        List<String> taskName3 = new ArrayList<>();
        taskName3.add("Dinner");
        taskName3.add("Watch TV");
        test.put(new Time(16,30),new Task(taskName));
        test.put(new Time(17,30),new Task(taskName2));
        test.put(new Time(18,30),new Task(taskName3));

        LinkedHashMap<Time , Task> test1 = new LinkedHashMap<>();
        List<String> taskName4 = new ArrayList<>();
        taskName4.add("Wake up");
        taskName4.add("Breakfast");
        List<String> taskName5 = new ArrayList<>();
        taskName5.add("Go to Work");
        taskName5.add("Meeting");
        List<String> taskName6 = new ArrayList<>();
        taskName6.add("Time Out");
        taskName6.add("Caffe Pause");
        test.put(new Time(8,30),new Task(taskName4));
        test.put(new Time(9,30),new Task(taskName5));
        test.put(new Time(10,30),new Task(taskName6));

        Map<Time , Task> test2 = new TreeMap<>();
        test2.putAll(test);
        test2.putAll(test1);

        System.out.println(test2); //простой вариант



        for (Map.Entry<Time , Task> entry : test2.entrySet()) {  // красивый
            System.out.println(entry.getKey() + " " + entry.getValue());
        }







    }
}
