package homework13.task1;

public class Cardemo {
    public static void main(String[] args) {
        Carservice carservice = new Carservice();
        int carcounter = 0 ;

        while (carcounter < 3)  {
            Car car = carservice.createcar();
            System.out.println("Машина добавлена в католог ");
            System.out.println(car);
            carcounter++;
        }

        System.out.println("Число машин в катологе  : " + carcounter);
    }
}
