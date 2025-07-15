package holidayWork.collection.collectionSecond10Tasks.task8;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Set<String> set1 = new HashSet<>();
        set1.add("v");
        set1.add("b");
        set1.add("c");

        Set<String> set2 = new HashSet<>();
        for (String str : set1) {
            for (String str2 : set) {
                if(str.contains(str2)) {
                    set2.add(str);
                }
            }
        }
        for(String str : set2) {
            System.out.println(str);
        }

    }
}
