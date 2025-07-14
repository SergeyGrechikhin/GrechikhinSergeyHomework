package holidayWork.generic.task5;

import java.sql.SQLOutput;

public class MyTaskDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("Наш верхний элемент - " + stack.peek());
        System.out.println("Удаляем - " + stack.pop());
        System.out.println("Новый верхний элемент - " + stack.peek());

        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        System.out.println("Размер  - " + stack2.maxSize());
    }
}
