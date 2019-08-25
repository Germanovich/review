package by.etc.module3.string_and_stringbuilder.task7;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если введено "abc cde
 * def", то должно быть выведено "abcdef";
 */

public class String7 {
    public static void main(String[] args) {
        String name = "  aaabd ddcvv   d  ";

        name = removeDuplicates(name.replaceAll(" ", ""));
        System.out.print(name);
    }

    static String removeDuplicates(String s) {
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String si = s.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1) {
                noDupes.append(si);
            }
        }
        return noDupes.toString();
    }
}
