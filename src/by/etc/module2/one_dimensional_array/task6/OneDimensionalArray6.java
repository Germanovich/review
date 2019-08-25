package by.etc.module2.one_dimensional_array.task6;

import java.util.Scanner;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
 * простыми числами.
 */

public class OneDimensionalArray6 {
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
            System.out.print(" " + array[i]);
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < size; i++) {
            boolean Prime = true;
            if (array[i] == 1) Prime = false;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    Prime = false;
                }
            }
            if (Prime) {
                sum += array[i];
            }
        }
        System.out.println("\nSum: " + sum);
    }
}
