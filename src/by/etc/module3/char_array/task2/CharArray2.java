package by.etc.module3.char_array.task2;

import java.util.Scanner;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class CharArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size array: ");
        int size1 = in.nextInt();
        int size2 = 0;

        char[] text = new char[size1];
        char[] letter = new char[]{'l', 'e', 't', 't', 'e', 'r'};

        for (int i = 0; i < size1; i++) {
            System.out.print((i + 1) + " element: ");
            text[i] = in.next().charAt(0);
            if (text[i] == 'w') {
                size2 += 6;
            } else {
                size2++;
            }
        }
        in.close();

        char[] itog = new char[size2];

        System.out.print("\nNot changed: ");
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
        System.out.print("\n");

        int number = 0;
        for (int i = 0; i < size1; i++) {
            if (i + 3 < size1) {
                if (text[i] == 'w' && text[i + 1] == 'o' && text[i + 2] == 'r' && text[i + 3] == 'd') {
                    for (int j = 0; j < letter.length; j++) {
                        itog[number] = letter[j];
                        number++;
                    }
                    i += 3;
                } else {
                    itog[number] = text[i];
                    number++;
                }
            } else {
                itog[number] = text[i];
                number++;
            }
        }
        System.out.print("Result: ");
        for (int i = 0; i < itog.length; i++) {
            System.out.print(itog[i]);
        }
    }
    // or
    //String str = new String(text);
    //System.out.println(str.replace("word", "letter"));
}
