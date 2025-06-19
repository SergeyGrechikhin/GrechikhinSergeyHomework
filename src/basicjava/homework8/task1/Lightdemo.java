package basicjava.homework8.task1;

public class Lightdemo {
    public static void main(String[] args) {
        LightService lightService = new LightService() ;
        Light lightinfo = new Light("Уличный фонарь",0,false) ;
        System.out.println(lightinfo);
        lightService.changelampe(lightinfo);
        System.out.println(lightinfo);
    }
}
