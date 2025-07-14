package holidayWork.generic.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static <T> void sort(List<T> list, Comparator<T> comparator){
        Collections.sort(list, comparator);
    }
}
