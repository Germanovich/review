package by.etc.module2.decomposition.task5;

import java.util.Scanner;

/**
 * Составить программу, которая в массиве А[N] находит второе по величине число(вывести на печать число, которое
 * меньше максимального элемента массива, но больше всех других элементов).
 */

public class Decomposition5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " element: ");
            array[i] = in.nextInt();
        }
        in.close();

        Decomposition5 almostMaximum = new Decomposition5();
        int almostMax = almostMaximum.search(array);
        System.out.print("Result: " + almostMax);
    }

    public int search(int[] array) {
        int max = array[0];
        int almostMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (almostMax < array[i] && max != array[i]) {
                almostMax = array[i];
            }
        }
        return almostMax;
    }
}
