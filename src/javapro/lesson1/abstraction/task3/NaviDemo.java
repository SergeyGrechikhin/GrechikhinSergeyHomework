package javapro.lesson1.abstraction.task3;

public class NaviDemo {
    public static void main(String[] args) {
        NavigationSystem navi1 = new CarNavi("Car Navigator");
        NavigationSystem navi2 = new MorineNavi("Morine Navigator");
        navi1.PrintTypeNavigation();
        navi1.startNavigation();
        navi1.stopNavigation();
        navi2.PrintTypeNavigation();
        navi2.startNavigation();
        navi2.stopNavigation();
    }
}
