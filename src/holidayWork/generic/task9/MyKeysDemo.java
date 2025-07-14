package holidayWork.generic.task9;

import org.w3c.dom.ls.LSOutput;

public class MyKeysDemo {
    public static void main(String[] args) {
        MyKeys<String ,Integer> myKeys = new MyKeys<>();
        myKeys.put("Один", 1);
        myKeys.put("Два", 2);
        System.out.println("Первый ключ " + myKeys.get("Один"));
        System.out.println("Второй ключ " + myKeys.get("Два"));
        myKeys.remove("Два");
        System.out.println(myKeys.get("Два"));

    }
}
