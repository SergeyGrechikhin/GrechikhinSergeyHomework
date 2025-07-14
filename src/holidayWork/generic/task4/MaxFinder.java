package holidayWork.generic.task4;

import java.util.List;

public class MaxFinder <T>{



    public static <T extends Comparable<T>>  void FindMax(List<T> list){
        if (list == null || list.size() == 0){
                System.out.println("Array empty");
                return;
        }
        T max = list.get(0);

        for (T item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        System.out.println("Max: " + max);



    }


}
