package holidayWork.optional.taskAll;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskOptional {
    public static void main(String[] args) {
List<String> strings = List.of("Oleg", "Max");
        System.out.println(firstString(strings));
        List<String> strings1 = List.of( "","Max");
        System.out.println(firstString(strings1));
        System.out.println(getMoreInteger(4));
        System.out.println(getMoreInteger(0));
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println(sumAll(integers));
        String myTestString = "Anna" ;
        System.out.println(findSizeString(myTestString));
        List<String> strings2 = List.of("Stas", "Petr");
        System.out.println(findFirstorThrow(strings2));

        int myintfortest = 4;
        System.out.println(doubleOrThrow(myintfortest));
        double doubleForTest = 4.0 ;
        System.out.println(findDoubleorThrow(doubleForTest));

        HashMap< String, Integer> map = new HashMap<>();
        map.put("Max",3);
        map.put("Oleg",2);
        map.put("Stas",1);
        System.out.println(findHighValue(map));


        System.out.println("Task 9");
        HashSet<String> name = new HashSet<>(Set.of("Max", "Oleg", "Petr"));
        Function<String ,Integer> function = String::length;
        System.out.println(transform(name,function));

        System.out.println("Task 10");
        List<String> names = List.of("Max",  "Victor");
        Optional<String> result = findFunction(names ,findname -> findname.length() > 3);
        System.out.println(result);





    }

    public static String firstString(List<String> list){
        return list.stream().findFirst().orElse("");
    }

    public static Optional<Integer> getMoreInteger(Integer doubleint) {
        return Optional.ofNullable(doubleint).map(n -> n * 2);
    }

    public static Optional<Integer> sumAll(List<Integer> list){
        return Optional.ofNullable(list.stream().mapToInt(Integer::intValue).sum());
    }

    public static Optional<String> findSizeString(String stringForSize){
        return Optional.ofNullable(String.valueOf(stringForSize.length()));
    }

    public static String findFirstorThrow(List<String> list){
        return Optional.ofNullable(list).flatMap(list1 -> list1.stream().findFirst()).orElseThrow(() -> new NoSuchElementException("List is Empty"));
    }

public static Integer doubleOrThrow(Integer intForDouble){
        return Optional.ofNullable(intForDouble).map(n -> n * 2).orElseThrow(() -> new IllegalArgumentException("Integer can not null be"));
}

public static Double findDoubleorThrow(Double mydouble){
        return Optional.ofNullable(mydouble).filter(n -> n > 0).map(Math::sqrt).orElseThrow(() -> new IllegalArgumentException("Double can not null be"));
}

public static Optional<Integer> findHighValue(HashMap<String ,Integer> myHashMap){
        return myHashMap.values().stream().max(Integer::compareTo);

}

public static <T,R> HashSet<R> transform(HashSet<T> hashSet, Function<T,R> function){
        if (hashSet == null || hashSet.isEmpty()){
            return new HashSet<>();
        }
        return hashSet.stream().map(function).collect(Collectors.toCollection(HashSet::new));
}

public static <T> Optional<T> findFunction(List<T> list, Predicate<T> function){
 return list.stream().filter(function).findFirst();
}


}
