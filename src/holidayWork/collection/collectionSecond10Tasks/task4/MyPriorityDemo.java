package holidayWork.collection.collectionSecond10Tasks.task4;

import java.util.PriorityQueue;

public class MyPriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<MyPriority> mycollection = new PriorityQueue<>();
        mycollection.add(new MyPriority("Java Homework" , 5));
        mycollection.add(new MyPriority("Python Homework" , 6));
        mycollection.add(new MyPriority("C++ Homework" , 7));

        while (!mycollection.isEmpty()){
            System.out.println(mycollection.poll());
        }



        }
    }



