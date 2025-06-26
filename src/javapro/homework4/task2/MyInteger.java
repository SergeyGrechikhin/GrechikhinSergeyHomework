package javapro.homework4.task2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class MyInteger {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            integers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Random integers");
        System.out.println(integers);
        int max = Collections.max(integers);
        int min = Collections.min(integers);
        System.out.println("Maximum number of integers is " + max);
        System.out.println("Minimum number of integers is " + min);
        Collections.sort(integers);
        System.out.println("Sorted integers");
        System.out.println(integers);

    }
}
