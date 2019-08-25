package by.etc.module6.task1.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils {

    public static String generateSecurePassword(String password) throws NoSuchAlgorithmException {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] securePassword = md5.digest(password.getBytes());
            StringBuilder builder = new StringBuilder();
            for(byte b : securePassword){
                builder.append(String.format("%02X 0", b));
            }
            return builder.toString();
    }

    public static boolean verifyUserPassword(String providedPassword, String securedPassword) {
        String newSecurePassword = null;
        try {
            newSecurePassword = generateSecurePassword(providedPassword);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return newSecurePassword.equalsIgnoreCase(securedPassword);
    }
}