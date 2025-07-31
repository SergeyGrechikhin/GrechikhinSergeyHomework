package javapro.homework14.task9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDemo {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Товар 1","Отправлен",1,"13.06.25",105,"Новинка"));
        orders.add(new Order("Товар 2","В обработке",2,"20.07.25",115,"Одежда"));
        orders.add(new Order("Товар 3","Отправлен",3,"20.07.25",110,"Запчасти"));
        orders.add(new Order("Товар 4","В обработке",4,"20.07.25",120,"Игрушки"));
        orders.add(new Order("Товар 5","Получен",5,"13.06.25",150,"Книги"));

        List<Order> juniOrder = orders.stream().filter(p -> p.getDate().substring(3,5).contains("06")).collect(Collectors.toList());
        System.out.println( "Заказы в июне : " + juniOrder);
        List<Order> juliOrder = orders.stream().filter(p -> p.getDate().substring(3,5).contains("07")).collect(Collectors.toList());
        System.out.println("Заказы в июле : " + juliOrder);

        System.out.println("Количество заказов в июне : " + juniOrder.size());


        System.out.println("Количество заказов в июле : " + juliOrder.size());




    }
}
