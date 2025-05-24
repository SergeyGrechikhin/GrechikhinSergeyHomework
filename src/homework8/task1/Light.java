package homework8.task1;

public class Light {
    String location;
    int brightness ;
    boolean isOn ;

    public Light(String location, int brightness, boolean isOn) {
        this.location = location;
        this.brightness = brightness;
        this.isOn = isOn;
    }

    public String getLocation() {
        return location;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                ", brightness=" + brightness +
                ", isOn=" + isOn +
                '}';
    }
}
