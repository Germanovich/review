package by.etc.module2.one_dimensional_array.task1;

import java.util.Scanner;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class OneDimensionalArray1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        System.out.print("Input K: ");
        int k = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " element: ");
            array[i] = in.nextInt();
            if (array[i] <= 0) {
                throw new IllegalArgumentException("element <= 0");
            }
        }

        in.close();

        System.out.print("Result:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
            if (array[i] % k == 0) {
                System.out.print(" " + array[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("\nSum: " + sum);
    }
}
