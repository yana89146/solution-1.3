package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Harry", "Potter", (byte) 11);
        userService.saveUser("Hermione", " Granger", (byte) 12);
        userService.saveUser("Ron", "Weasley", (byte) 10);
        userService.saveUser("Rubeus", "Hagrid", (byte) 62);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
