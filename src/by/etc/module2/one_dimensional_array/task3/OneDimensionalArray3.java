package by.etc.module2.one_dimensional_array.task3;

import java.util.Scanner;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и
 * нулевых элементов.
 */

public class OneDimensionalArray3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];

        int negative = 0;
        int zero = 0;
        int positive = 0;

        for (int i = 0; i < size; i++) {
            System.out.print(i + " element: ");
            array[i] = in.nextInt();
            if (array[i] > 0) {
                positive++;
            }
            if (array[i] < 0) {
                negative++;
            }
            if (array[i] == 0) {
                zero++;
            }
        }

        in.close();

        System.out.print("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nPositive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
