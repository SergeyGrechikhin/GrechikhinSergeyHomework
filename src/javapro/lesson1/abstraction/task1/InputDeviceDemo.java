package javapro.lesson1.abstraction.task1;

public class InputDeviceDemo {
    public static void main(String[] args) {
        InputDevice inputDevice1 = new Keyboard("Keyboard","Bluetooh keyboard") ;
        InputDevice inputDevice2 = new Mouse("Mouse","20 cm") ;
        inputDevice1.PrintTypeDevice();
        inputDevice1.disconnect();
        inputDevice2.PrintTypeDevice();
        inputDevice2.connect();
    }
}
