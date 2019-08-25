package by.etc.module2.one_dimensional_array.task5;

import java.util.Scanner;

/**
 * Даны целые числа а1, а2, ..., а(n). Вывести на печать только те числа, для которых а[i] > i.
 */

public class OneDimensionalArray5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " element: ");
            array[i] = in.nextInt();
        }

        in.close();

        System.out.print("Result:");
        for (int i = 0; i < size; i++) {
            if (array[i] > i) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
    }
}
