package basicjava.homework6.task3;

public class Temperature {
    double temperaturec ;
    double temperaturef ;
    double resulttemperaturef ; //второй способ


    public Temperature(double temperaturec) {
        this.temperaturec = temperaturec;
    }

    public void infotemperaturec() {
        System.out.println("Teмпература в Цельсиях : " + temperaturec + " Градусов ");
    }

    public void infotemperaturef () {
        temperaturef = (temperaturec * 9/5) + 32 ;
        System.out.println("Температура в Фарeнгейтах : " + temperaturef + " Градусов ");
    }
    //второй способ
    public void infotemperaturef1 (double tc) {
        resulttemperaturef = (tc * 9/5) + 32 ;
        System.out.println(" Температура в Цельсиях : " + tc );
        System.out.println("Температура в Фаренгейтах " + resulttemperaturef );

    }

    public double infotemperaturef2 (double  tc1 ) {   //Третий способ
        System.out.println(" Градусы в Цельсиях : " + tc1 + " градусов " );
        double resulttf = (tc1 * 9/5) + 32 ;
        return resulttf ;

    }
    public void  infotemperaturef3 (String typeoperation , double resulttf) {

        System.out.println("Результат операции " + typeoperation + " равен " + resulttf + " градусов ");
    }
}
