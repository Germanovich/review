package by.etc.module3.string_and_stringbuilder.task1;

/**
 * Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class String1 {
    public static void main(String[] args) {
        String text = ("     He   llo      World");
        int number = 0;
        int max = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                number++;
            } else {
                if (number > max) {
                    max = number;
                }
                number = 0;
            }
        }
        System.out.println("Result: " + max);
    }
}
