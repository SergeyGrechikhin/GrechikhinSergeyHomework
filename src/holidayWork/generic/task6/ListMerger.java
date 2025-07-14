package holidayWork.generic.task6;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
      public static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2){
          List<T> list = new ArrayList<T>();
          int i = 0 ,  j = 0;
          while (i < list1.size() && j < list2.size()){
              T item1 = list1.get(i);
              T item2 = list2.get(j);

              if(item1.compareTo(item2) <= 0){
                  list.add(item1);
                  i++;
              } else {
                  list.add(item2);
                  j++ ;
              }
          }

          while (i < list1.size()){
              list.add(list1.get(i));
              i++;
          }

          while (j < list2.size()){
              list.add(list2.get(j));
              j++;
          }


          return list;
      }
}
