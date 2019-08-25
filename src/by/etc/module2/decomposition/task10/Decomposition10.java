package by.etc.module2.decomposition.task10;

import java.util.Scanner;

/**
 * Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого являются
 * цифры числа N.
 */

public class Decomposition10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int x = in.nextInt();
        System.out.print("Input size: ");
        int size1 = in.nextInt();
        int array1[] = new int[size1];


        if (x < 1 || size1 < 1) {
            throw new IllegalArgumentException("x < 1 or size < 1");
        }

        Decomposition10 workOnNumber = new Decomposition10();

        int size2 = workOnNumber.quantity(x);
        int array2[] = new int[size2];
        array2 = workOnNumber.separation(x, array2);

        for (int i = 0; i < size1; i++) {
            int j = (int) (Math.random() * size2);
            array1[i] = array2[j];
        }

        for (int i = 0; i < size1; i++) {
            System.out.print(" " + array1[i]);
        }
    }


    public static int quantity(int x) {
        int k = 0;
        while (x != 0) {
            x /= 10;
            k++;
        }
        return k;
    }

    public static int[] separation(int x, int[] array) {
        int p = 0;
        while (x != 0) {
            array[p] = x % 10;
            x /= 10;
            p++;
        }

        return array;
    }
}
