package javapro.lesson1.abstraction.task1;

public class Mouse extends InputDevice{
    private String size;

    public Mouse(String type, String size) {
        super(type);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void PrintTypeDevice() {
        super.PrintTypeDevice();
    }

    @Override
    public void disconnect() {
        System.out.println("Mouse disconnected");
    }

    @Override
    public void connect() {
        System.out.println("Mouse connected");
    }
}
