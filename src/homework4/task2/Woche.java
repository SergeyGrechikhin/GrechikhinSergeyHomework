package homework4.task2;

public class Woche {
    public static void main(String[] args) {
        //Задача № 2
        int monday = 19 ; //Погода которая будет всю неделю
        int tuesday = 21 ;
        int wednesday = 22 ;
        int thursday = 20 ;
        int friday = 20 ;
        int saturday = 22 ;
        int sunday = 22 ;

        int average =  (monday + tuesday + wednesday + thursday + friday + saturday + sunday)/7 ;
        System.out.println("Общая средняя погода на неделе = " + average + " градусов ");
    }
}
