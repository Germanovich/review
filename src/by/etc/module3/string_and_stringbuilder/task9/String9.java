package by.etc.module3.string_and_stringbuilder.task9;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
 * английские буквы.
 */

public class String9 {
    public static void main(String[] args) {
        String text = "He Likes Classical Music";
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                number1++;
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                number2++;
            }
        }
        System.out.println("Small letters: " + number1);
        System.out.println("Big  letters: " + number2);
    }
}
