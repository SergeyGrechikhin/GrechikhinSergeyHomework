package javapro.lesson1.abstraction.task1;

abstract class InputDevice {
private String type;

    public InputDevice(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

     abstract void connect();
    abstract void disconnect();

    public void PrintTypeDevice(){
        System.out.println("Device Type");
        System.out.println("Device " + type);
    }
}
