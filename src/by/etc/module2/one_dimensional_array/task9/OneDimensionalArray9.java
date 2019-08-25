package by.etc.module2.one_dimensional_array.task9;

import java.util.Scanner;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
 * несколько, то определить наименьшее из них.
 */

public class OneDimensionalArray9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 5) - 1);
            System.out.println(array[i]);
        }
        in.close();

        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }

        int number = array[0];
        int quantity = 1;
        int k = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j]) k++;

            }
            if (((quantity == k) && (number > array[i])) || (quantity < k)) {
                number = array[i];
                quantity = k;
            }
            k = 0;
        }
        System.out.println("\nMost met number: " + number + " occurs " + quantity + " times");
    }
}
