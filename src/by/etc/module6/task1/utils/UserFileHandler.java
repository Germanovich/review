package by.etc.module6.task1.utils;

import by.etc.module6.task1.entity.user.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileHandler {

    private static String csvFile = "C:\\Users\\Пользователь\\IdeaProjects\\untitled3\\" +
            "src\\by\\etc\\module6\\task1\\data\\users.csv";

    public static List<User> loadUsers() {

        String line;

        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                User user = new UserBuilder(data[2], data[3])
                        .setRole(Role.valueOf(data[0].toUpperCase()))
                        .setEmail(new Email(data[1]))
                        .build();
                users.add(user);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void saveUserList(List<User> users) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            for (User user : users) {

                String sb = user.getRole().name().toLowerCase() + "," +
                        user.getEmail() + "," +
                        user.getUserName() + "," +
                        String.valueOf(user.getPassword());
                bw.write(sb);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
