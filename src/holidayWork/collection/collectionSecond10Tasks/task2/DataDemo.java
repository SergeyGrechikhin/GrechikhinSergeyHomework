package holidayWork.collection.collectionSecond10Tasks.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DataDemo {
    public static void main(String[] args) {
        TreeMap<Data , List<String>>  dataStringTreeMap= new TreeMap<>() ;
        dataStringTreeMap.put(new Data("12.06.25"), new ArrayList<>(List.of("Happy Birthday")));
        dataStringTreeMap.put(new Data("13.06.25"), new ArrayList<>(List.of("School")));
        dataStringTreeMap.put(new Data("14.06.25"), new ArrayList<>(List.of("Holiday")));

        for(Map.Entry<Data , List<String>> entry: dataStringTreeMap.entrySet()){
            System.out.println(entry.getKey());
            for(String  string: entry.getValue()){
                System.out.println(string);
            }
        }



    }
}
