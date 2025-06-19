package javapro.lesson1.abstraction.task3;

import org.w3c.dom.ls.LSOutput;

public class CarNavi extends NavigationSystem {
    public CarNavi(String navitype) {
        super(navitype);
    }

    @Override
    void startNavigation() {
        System.out.println("Start Navigation");
        System.out.println("To get to Mancheton Street, turn left first, then right");

    }

    @Override
    void stopNavigation() {
        System.out.println("You have reached your point");
    }
}
