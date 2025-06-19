package javapro.lesson1.abstraction.task3;

public class MorineNavi extends NavigationSystem {
    public MorineNavi(String navitype) {
        super(navitype);
    }

    @Override
    void startNavigation() {
        System.out.println("Start Navogation");
        System.out.println("First head east, then west.");
    }

    @Override
    void stopNavigation() {
        System.out.println("You have reached your point");
    }
}
