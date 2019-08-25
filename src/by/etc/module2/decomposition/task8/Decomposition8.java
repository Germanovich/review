package by.etc.module2.decomposition.task8;

import java.util.Scanner;

/**
 * Задан массив D. Определить суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6]. Пояснение. Составить
 * метод (методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class Decomposition8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length( >= 5): ");
        int size = in.nextInt();
        System.out.print("Input k: ");
        int k = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();
        int array[] = new int[size];

        if ((m - k) < 4) {
            throw new IllegalArgumentException("(m  - k) < 4");
        }
        if (k < 1 || k > m) {
            throw new IllegalArgumentException("k < 1 || k > m");
        }
        if (m > size || m < k) {
            throw new IllegalArgumentException("m > size || m < k");
        }

        int number = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            int sum = sumNumber(k, array);
            System.out.println(number + ") sum = " + sum);
            k++;
            number++;
        }

    }

    public static int sumNumber(int k, int[] array) {
        return array[k - 1] + array[k] + array[k + 1];
    }
}
