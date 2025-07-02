package javapro.homework6.task1;

public class MyInteger {
    private int myint;

    public int getMyint() {
        return myint;
    }

    public MyInteger(int myint) {
        this.myint = myint;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "myint=" + myint +
                '}';
    }
}
