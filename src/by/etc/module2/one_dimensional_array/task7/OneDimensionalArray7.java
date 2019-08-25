package by.etc.module2.one_dimensional_array.task7;

import java.util.Scanner;

/**
 * 7. Даны действительные числа a1, a2, ..., a(n). Найти max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1)).
 */
public class OneDimensionalArray7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size * 2];

        for (int i = 0; i < size * 2; i++) {
            array[i] = ((int) (Math.random() * size * 20) - 20);
            System.out.println(array[i]);
        }
        in.close();

        System.out.print("Result:");
        for (int i = 0; i < size * 2; i++) {
            System.out.print(" " + array[i]);
        }

        int max = array[0] + array[(size * 2) - 1];
        for (int i = 1; i < size * 2; i++) {
            if ((array[i] + array[size * 2 - i - 1]) > max) max = array[i] + array[(size * 2) - i - 1];
        }
        System.out.println("\n Max: " + max);
    }
}
