package by.etc.module3.char_array.task4;

import java.util.Scanner;

/**
 * В строке найти количество чисел.
 */

public class CharArray4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size array: ");
        int size1 = in.nextInt();

        char[] text = new char[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print((i + 1) + " element: ");
            text[i] = in.next().charAt(0);
        }
        in.close();

        System.out.print("\nArray: ");
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
        System.out.print("\n");

        int number = 0;
        for (int i = 1; i < size1; i++) {
            if ((text[i - 1] >= '0' && text[i - 1] <= '9')) {
                if (i == (size1 - 1) || (text[i] >= 'a' && text[i] <= 'z')) {
                    number++;
                }
            }
            if (i == size1 - 1 && (text[i] >= '0' && text[i] <= '9') && (text[i - 1] >= 'a' && text[i - 1] <= 'z')) {
                number++;
            }
        }
        System.out.print("Result: " + number);
    }
}
