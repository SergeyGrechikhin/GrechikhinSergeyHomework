package javapro.homework14.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tomate","Vegetables",20,15));
        products.add(new Product("Potato","Vegetables",25,5));
        products.add(new Product("Onion","Vegetables",30,25));
        products.add(new Product("Ananas","Fruits",15,20));
        products.add(new Product("Apple","Fruits",35,50));
        products.add(new Product("Grape","Fruits",40,30));


        int  quantity = 10 ;


        Map<String, Double> products1 = products.stream().filter(p -> p.getQuantity() > quantity).collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));

products1.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
