package by.etc.module3.string_and_stringbuilder.task10;

/**
 * Строка состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

public class String10 {
    public static void main(String[] args) {
        String text = "Abcd. E!? А!";

        int number = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            if ((text.charAt(i + 1) == '.' || text.charAt(i + 1) == '!' || text.charAt(i + 1) == '?')) {
                if (!(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?')) {
                    number++;
                }
            }
        }
        System.out.println("Number of proposals: " + number);
    }
}
