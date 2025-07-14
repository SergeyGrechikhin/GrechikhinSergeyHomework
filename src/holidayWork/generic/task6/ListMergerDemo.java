package holidayWork.generic.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMergerDemo {
    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listTwo = Arrays.asList(22, 41, 12, 56, 471, 78, 45, 12, 11, 15);
        List<Integer> merge = ListMerger.merge(listOne, listTwo);
        System.out.println("Oбьедененый список - " + merge);



    }
}
