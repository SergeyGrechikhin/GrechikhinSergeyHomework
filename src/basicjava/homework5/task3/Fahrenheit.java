package basicjava.homework5.task3;

public class Fahrenheit {
    double celsius ;

    public void toFahrenheit()  {
        double fahrenheit = (celsius * 9 / 5 ) + 32 ;
        System.out.println(celsius + " Градусов цельсия = " +   fahrenheit + " Градусов по Фаренгейту " );

    }

}
