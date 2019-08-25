package by.etc.module2.one_dimensional_array.task2;

import java.util.Scanner;

/**
 * Дана последовательность действительных чисел a1, a2 ... a(n). Заменить все ее члены, больше заданного Z, этим числом.
 * Подсчитать количество замен.
 */

public class OneDimensionalArray2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        System.out.print("Input Z: ");
        int z = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " element: ");
            array[i] = in.nextInt();
        }

        in.close();
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > z) {
                array[i] = z;
                number++;
            }
        }
        System.out.print("Result:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nNumber of replacements: " + number);
    }
}
