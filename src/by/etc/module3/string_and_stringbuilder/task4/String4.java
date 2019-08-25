package by.etc.module3.string_and_stringbuilder.task4;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".
 */

public class String4 {
    public static void main(String[] args) {
        String name = "информатика";

        String cake = name.substring(7, 8) + name.substring(3, 5) + name.substring(7, 8);
        System.out.print(cake);
    }
}
