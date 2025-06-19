package javapro.lesson1.abstraction.task3;

abstract class NavigationSystem {
    private String navitype;

    public NavigationSystem(String navitype) {
        this.navitype = navitype;
    }

    public String getNavitype() {
        return navitype;
    }

    abstract void startNavigation();
    abstract void stopNavigation();
    public void PrintTypeNavigation(){
        System.out.println("Navigation for :");
        System.out.println("Device " + navitype);
    }

}
