package by.etc.module3.string_and_stringbuilder.task8;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
 * самых длинных слов может быть несколько, не обрабатывать.
 */

public class String8 {
    public static void main(String[] args) {
        String text = "He likes classical music";
        String[] word = text.split(" ");
        String maxLethWord = new String();
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= maxLethWord.length()) {
                maxLethWord = word[i];
            }
        }
        System.out.println("Result: " + maxLethWord);
    }
}
