package homework4.task1;

public class Manager {
    public static void main(String[] args) {
        //Задача № 1

        int telefon1 = 1000 ; //Цена товара первого
        int telefon2 = 500 ;  //Цена товара второго
        int sale = 100   ;    // Скидка если купить вместе

        int totalprice = telefon1 + telefon2 ; //Сумма двух телефон
        int totalpricewithsale = totalprice - sale ; //Общая сумма со скидкой

        System.out.println("Общая сумма двух телефонов = " + totalprice ) ;
        System.out.println("Общая сумма со скидкой = " + totalpricewithsale) ;
        System.out.println("Общая скидка = "+ sale);
    }
}
