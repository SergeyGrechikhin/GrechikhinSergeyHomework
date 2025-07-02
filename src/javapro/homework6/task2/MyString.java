package javapro.homework6.task2;

public class MyString {
    private String mystring;

    public String getMystring() {
        return mystring;
    }

    public MyString(String mystring) {
        this.mystring = mystring;
    }

    public void setMystring(String mystring) {
        this.mystring = mystring;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "mystring='" + mystring + '\'' +
                '}';
    }
}
