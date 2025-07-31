package javapro.homework14.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Книга1","Автор1", Arrays.asList("Фантастика", "Мрачное", "Детектив")));
        books.add(new Book("Книга2","Автор2", Arrays.asList("Фантастика", "Комедия", "Приключения")));
        books.add(new Book("Книга3","Автор3", Arrays.asList("Фантастика", "Роман" ,"")));
        books.add(new Book("Книга4","Автор4", Arrays.asList("Фантастика", "Детская книга", "Образование")));

        List<String> uniqueBookTag = books.stream().flatMap(p -> p.getTags().stream()).filter(s -> !s.equalsIgnoreCase("Фантастика")) .distinct().collect(Collectors.toList());

        System.out.println("Unique Book Tag : " + uniqueBookTag);


    }
}
