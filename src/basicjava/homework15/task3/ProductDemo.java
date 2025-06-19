package basicjava.homework15.task3;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        System.out.println(" На уроке '12'  было дано задание .");
        System.out.println("C учетом новых знаний переделал это код /Какой был код до этого можно увидеть в infofortask3 . ");
        System.out.println("Создайте класс продукт (наименование, цена, количество)\n" +
                "Запросите у пользователя данные для создания трех экземпляров этого класса.\n" +
                "В момент создания нового продукта проверьте - есть ли уже продукт с таким названием?\n");
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Введите сколько товаров вы хотите создать");
        int myproductcounter = scanner.nextInt();
        scanner.nextLine();
        Product[] products = new Product[myproductcounter] ;

        for (int i = 0; i < products.length; i++) {
            System.out.println("Введите имя товара");
            System.out.println("Имя товара не должно повторяться !!! ");
            String name = scanner.nextLine() ;
            boolean isnamevalid = false ;
            for (int j = 0; j < i; j++) {
                if (products[j].getName().equalsIgnoreCase(name)) {
                    isnamevalid = true ;
                    break;
                }

            }
            if (isnamevalid)  {
                System.out.println("Имя товара уже существует");
                i = i-1; //Loop
            }else {
                System.out.println("Введите цену товара");
                String price = scanner.nextLine() ;
                System.out.println("Введите кол-во товара");
                String quantity = scanner.nextLine() ;
                Product product = new Product(name,quantity,price);
                products[i] = product ;
            }


        }

        for (int i = 0; i < products.length; i++) {

                System.out.println(" Имя товара " + (i + 1) + " : " + products[i].getName());
            System.out.println(" Цена товара " + (i + 1) + " : " + products[i].getPrice() + " Euro ");
            System.out.println(" Кол-во товара " + (i + 1) + " : " + products[i].getQuantity());

        }




    }
}


