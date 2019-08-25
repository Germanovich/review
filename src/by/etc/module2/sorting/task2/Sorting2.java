package by.etc.module2.sorting.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающией. Примечание. Дополнительный массив не использовать.
 */

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int size1 = in.nextInt();

        System.out.print("Input M: ");
        int size2 = in.nextInt();

        int number = 1;
        for (int i = 0; i < size1; i++) {
            array1.add(number + number / 2);
            number++;
        }

        System.out.print("1 array: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(" " + array1.get(i));
        }

        int array2[] = new int[size2];

        number = 1;
        for (int i = 0; i < size2; i++) {
            array2[i] = (number + 2);
            number += 2;
        }

        System.out.println();
        System.out.print("2 array: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(" " + array2[i]);
        }

        in.close();

        int j = 0;
        for (int i = size1; i < size1 + size2; i++) {
            if (j < size2) {
                array1.add(i, array2[j]);
                j++;
            }
        }

        for (int i = (array1.size() - 1); i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array1.get(j) > array1.get(j + 1)) {
                    int tmp = array1.get(j);
                    array1.set(j, array1.get(j + 1));
                    array1.set(j + 1, tmp);
                }
            }
        }

        System.out.println();
        System.out.print("Result:");
        for (int i = 0; i < size1 + size2; i++) {
            System.out.print(" " + array1.get(i));
        }
        array1.clear();
    }
}
