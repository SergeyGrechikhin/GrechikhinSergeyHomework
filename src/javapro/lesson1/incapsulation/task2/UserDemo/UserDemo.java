package javapro.lesson1.incapsulation.task2.UserDemo;

import javapro.lesson1.incapsulation.task2.entity.User;
import javapro.lesson1.incapsulation.task2.service.UserService;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("Username","1234567891011","User@gmail.com");
        System.out.println(user.getPassword());
        UserService userService = new UserService();
        userService.changePassword(user,"1234567891011","MyPassword");

        System.out.println(user.getPassword());
    }
}
