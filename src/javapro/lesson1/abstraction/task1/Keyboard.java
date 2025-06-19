package javapro.lesson1.abstraction.task1;

public class Keyboard extends InputDevice {
    private String keyboardType;

    public Keyboard(String type, String keyboardType) {
        super(type);
        this.keyboardType = keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    @Override
    public void PrintTypeDevice() {
        super.PrintTypeDevice();
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected");
    }

    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }
}
