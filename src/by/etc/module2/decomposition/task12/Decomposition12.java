package by.etc.module2.decomposition.task12;

import java.util.Scanner;

/**
 * Даны натуральные числа K и N. Написать метод (методы) формирования массива А, элементами которого являются
 * числа, сумма цифр которых равна K и которые не больше N.
 */

public class Decomposition12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input K: ");
        int k = in.nextInt();
        System.out.print("Input N: ");
        int n = in.nextInt();
        int array[] = new int[n];
        in.close();

        Decomposition12 number = new Decomposition12();
        array = number.combination(array, n, k);

        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] combination(int[] array, int n, int k) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (sum(i) == k) {
                array[c] = i;
                c++;
            }
        }
        return array;
    }

    public static int sum(int numbet) {
        int buffer = 0;
        while (numbet != 0) {
            buffer += numbet % 10;
            numbet = numbet / 10;
        }
        return buffer;
    }
}
