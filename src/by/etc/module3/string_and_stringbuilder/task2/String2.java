package by.etc.module3.string_and_stringbuilder.task2;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class String2 {
    public static void main(String[] args) {
        String text = "aaagfth a gdgr da gjh";

        System.out.println("Result: " + putSymbol(text, "a", "b"));
    }

    public static String putSymbol(String text, String symbolBefore, String symbolAfter) {
        return text.replaceAll(symbolBefore, symbolBefore + symbolAfter);
    }
}
