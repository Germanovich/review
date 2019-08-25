package by.etc.module3.char_array.task5;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние
 * пробелы удалить.
 */

public class CharArray5 {
    public static void main(String[] args) {
        char[] text = new char[]{' ', 'h', 'i', ' ', ' ', ' ', 'D', 'i', 'm', 'a', ' ', 'h', ' ', ' ', ' ', 'f', ' '};

        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
        System.out.print("\n");

        int number = 1;
        for (int i = 1; i < text.length; i++) {
            number++;
            if (text[i - 1] == ' ' && text[i] == ' ') {
                number--;
            }
        }
        if (text[0] == ' ') {
            number--;
        }
        if (text[text.length - 1] == ' ') {
            number--;
        }
        char[] itog = new char[number];
        int j = 0;

        for (int i = 1; i < text.length; i++) {
            if (j < number) {
                if (text[i - 1] != ' ' && text[i] == ' ') {
                    itog[j] = text[i - 1];
                    if (j + 1 < number) {
                        itog[j + 1] = text[i];
                    }
                    j += 2;
                    i++;
                } else if (text[i - 1] != ' ' && text[i] != ' ') {
                    itog[j] = text[i - 1];
                    j++;

                }
            }
        }

        for (int i = 0; i < itog.length; i++) {
            System.out.print(itog[i]);
        }
    }
}
