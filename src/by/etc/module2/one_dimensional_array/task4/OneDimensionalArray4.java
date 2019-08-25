package by.etc.module2.one_dimensional_array.task4;

import java.util.Scanner;

/**
 * Даны действительные числа а1, а2, ..., а(n).  Поменять местами наибольший и наименьший элементы.
 */

public class OneDimensionalArray4 {
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

        int min = array[0];
        int imin = 0;
        int max = array[0];
        int imax = 0;

        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
            if (min > array[i]) {
                min = array[i];
                imin = i;
            }
        }

        array[imax] = min;
        array[imin] = max;

        System.out.print("Result:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
