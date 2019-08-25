package by.etc.module6.task1.utils;

import by.etc.module6.task1.entity.user.Role;
import by.etc.module6.task1.entity.user.User;
import by.etc.module6.task1.entity.user.UserBuilder;

import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

public class UserUtils {

    private static List<User> users;

    static {
        users = UserFileHandler.loadUsers();
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User login(String username, String password) {

        for (User user : users) {
            if (user.getUserName()
                    .equalsIgnoreCase(username) && PasswordUtils.verifyUserPassword(password,
                    new String(user.getPassword()))) {
                return user;
            }
        }

        throw new IllegalArgumentException("The current user doesn't exists!");
    }

    public static boolean addUser(String userName, String password) throws NoSuchAlgorithmException {
        if (!isUserExist(userName)) {
            String securePassword = PasswordUtils.generateSecurePassword(password);
            User user = new UserBuilder(userName, securePassword).build();
            users.add(user);
            UserFileHandler.saveUserList(users);
            return true;
        }
        else {
            System.out.println("The user with \"" + userName + "\" is exist!");
            return false;
        }
    }

    public static boolean removeUser(String username, String password) throws NoSuchAlgorithmException {
        if (!isUserExist(username)) {
            System.out.println("The user with \"" + username + "\" isn't exist!");
            return false;
        } else {
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                if (username.equalsIgnoreCase(user.getUserName())) {
                    String securedPassword = PasswordUtils.generateSecurePassword(password);
                    if (securedPassword.equalsIgnoreCase(new String(user.getPassword()))) {
                        iterator.remove();
                    }
                }
            }
            UserFileHandler.saveUserList(users);
            return true;
        }
    }

    private static boolean isUserExist(String userName) {
        return users.stream().anyMatch(u -> u.getUserName().equalsIgnoreCase(userName));
    }

    static boolean isAdmin(User user) {
        return user.getRole() == Role.ADMIN;
    }
}
