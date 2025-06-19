package basicjava.homework6.task3;

public class Temperaturedemo {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(20) ;
        temperature.infotemperaturec();
        temperature.infotemperaturef();

        System.out.println("-------------------------------------------");
        System.out.println(" Второй способ ");
        temperature.infotemperaturef1(20);

        System.out.println("-------------------------------------------");
        System.out.println(" Третий способ ");

        double result = temperature.infotemperaturef2(20) ;
        temperature.infotemperaturef3("Переход в Фаренгейты :", result);

    }
}
