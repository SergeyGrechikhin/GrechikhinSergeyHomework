package javapro.lesson1.incapsulation.task2.service;

import javapro.lesson1.incapsulation.task2.entity.User;

public class UserService {
    private User user;
    public boolean changePassword(User user ,String oldPassword, String newPassword){
        if (!user.getPassword().equals(oldPassword)){
            System.out.println("The old password is not correct");
            return false;
        }
        if (newPassword.length() == 11 && newPassword.length() < 12){
            System.out.println("The new password is too short or too long");
            return false;
        }
        user.setPassword(newPassword);
        System.out.println("Password changed successfully");
        return true;
    }



}
