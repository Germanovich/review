package by.etc.module2.one_dimensional_array.task8;

import java.util.Scanner;

/**
 * Дана последовательность целых чисел a1, a2, ..., a(n). Образовать новую последовательность, выбросив из исходной
 * те члены, которые равны min(a1, a2, ..., a(n)).
 */

public class OneDimensionalArray8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];
        int array2[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * size * 20) - 20);
            System.out.println(array[i]);
        }
        in.close();

        int min = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] < min) min = array[i];
        }
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != min) {
                array2[c] = array[i];
                c++;
            }
        }

        System.out.print("Result:");
        for (int i = 0; i < size; i++) {
            if (array2[i] != 0)
                System.out.print(" " + array2[i]);
        }
    }
}
