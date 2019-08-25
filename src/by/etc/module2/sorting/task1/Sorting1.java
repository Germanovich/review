package by.etc.module2.sorting.task1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число K. Объединить их в один
 * массив, включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив.
 */

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.print("Input array1 size: ");
        int size1 = in.nextInt();

        System.out.print("Input array2 size: ");
        int size2 = in.nextInt();

        for (int i = 0; i < size1; i++) {
            System.out.print((i + 1) + " element array1: ");
            array1.add(in.nextInt());
        }

        int array2[] = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print((i + 1) + " element array2: ");
            array2[i] = in.nextInt();
        }
        System.out.print("Input k: ");
        int k = in.nextInt();
        k = k - 1;
        in.close();

        int j = 0;
        for (int i = size1; i < size1 + size2; i++) {
            if (j < size2) {
                array1.add(i, array2[j]);
                j++;
            }
        }

        int last = size1 + size2;
        for (int i = k; i < size1; i++) {
            array1.add((last), array1.get(k));
            array1.remove(k);
        }

        System.out.print("Result:");
        for (int i = 0; i < size1 + size2; i++) {
            System.out.print(" " + array1.get(i));
        }
        array1.clear();
    }
}
