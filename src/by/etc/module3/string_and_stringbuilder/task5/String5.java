package by.etc.module3.string_and_stringbuilder.task5;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква "a".
 */

public class String5 {
    public static void main(String[] args) {
        String text = ("a He lalo aaa Worlad");
        int number = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                number++;
            }
        }
        System.out.println("Result: " + number);
    }
}
