package holidayWork.generic.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> myints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> myeven = Filter.filter(myints, new EvenFilter()) ;
        System.out.println("Only Even " + myeven);
    }
}
