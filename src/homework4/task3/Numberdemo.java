package homework4.task3;

public class Numberdemo {
    public static void main(String[] args) {
        Number Number1 = new Number() ; //Переменная Int
        Number Number2 = new Number() ;
        Number Number3 = new Number() ;

        Number1.number = 4 ;
        Number2.number = 21;
        Number3.number = 20 ;

        System.out.println("Остаток от деления числа 4 на 2 = " + (Number1.number % 2) );
        System.out.println("Остаток от деления числа 4 на 3 = " + (Number1.number % 3) );
        System.out.println("Остаток от деления числа 21 на 2 = " + (Number2.number % 2) );
        System.out.println("Остаток от деления числа 21 на 3 = " + (Number2.number % 3) );
        System.out.println("Остаток от деления числа 20 на 2 = " + (Number3.number % 2) );
        System.out.println("Остаток от деления числа 20 на 3 = " + (Number3.number % 3) );

        Number Number4 = new Number() ; //Переменная Double
        Number Number5 = new Number() ;
        Number Number6 = new Number() ;

        Number4.numberd = 26 ;
        Number5.numberd = 82 ;
        Number6.numberd = 65 ;

        System.out.println("Остаток от деления числа 26 на 2 = " + (Number4.numberd % 2) );
        System.out.println("Остаток от деления числа 26 на 3 = " + (Number4.numberd % 3) );
        System.out.println("Остаток от деления числа 82 на 2 = " + (Number5.numberd % 2) );
        System.out.println("Остаток от деления числа 82 на 3 = " + (Number5.numberd % 3) );
        System.out.println("Остаток от деления числа 65 на 2 = " + (Number6.numberd % 2) );
        System.out.println("Остаток от деления числа 65 на 3 = " + (Number6.numberd % 3) );

    }
}
