package by.etc.module3.string_and_stringbuilder.task3;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class String3 {
    public static void main(String[] args) {
        String text = "papa";

        if (text.equalsIgnoreCase(new StringBuilder(text).reverse().toString())) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not palindrome");
        }
    }
}
