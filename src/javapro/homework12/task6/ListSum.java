package javapro.homework12.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        SumListInterface list = (list1  , list2) -> {
            List<String> mysumList =  new ArrayList<>();
            mysumList.addAll(list1);
            mysumList.addAll(list2);
            return mysumList;
        };

        List<String> firstList = Arrays.asList("a", "b", "c");
        List<String> secondList = Arrays.asList("d", "e", "f");
        List<String> thirdList = list.sumList(firstList, secondList);
        System.out.println(thirdList);



    }
}
