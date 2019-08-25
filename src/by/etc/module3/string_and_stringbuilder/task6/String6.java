package by.etc.module3.string_and_stringbuilder.task6;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class String6 {
    public static void main(String[] args) {
        String name = "abcd";
        String result = new String();

        for (int i = 0; i < name.length(); i++) {
            result += name.substring(i, i + 1) + name.substring(i, i + 1);
        }
        System.out.print(result);
    }
}
