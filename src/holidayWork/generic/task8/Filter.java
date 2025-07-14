package holidayWork.generic.task8;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static <T> List<T> filter(List<T> list, MyPredicate<T> p) {
        List<T> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            T item =  list.get(i);
            if (p.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
