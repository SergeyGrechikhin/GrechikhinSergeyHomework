package holidayWork.generic.task2;

import java.awt.*;
import java.util.List;

public class PrintList {


    public static <T> void printer(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }


}
