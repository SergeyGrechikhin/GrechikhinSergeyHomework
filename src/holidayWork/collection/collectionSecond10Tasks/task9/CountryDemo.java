package holidayWork.collection.collectionSecond10Tasks.task9;

import java.util.*;

public class CountryDemo {
    public static void main(String[] args) {
        Map<Country,List<String>> countries = new HashMap<>();
        countries.put(new Country("Germany"), List.of("Berlin", "Harsewinkel"));
        countries.put(new Country("KZ"), List.of("Astana", "Pavlodar"));
        countries.put(new Country("United States"), List.of("New York", "Down Town"));

       List<Country> mycountry = new ArrayList<>(countries.keySet());
       Collections.sort(mycountry);
       for(Country c : mycountry){
           System.out.println(c );
       }

    }
}
