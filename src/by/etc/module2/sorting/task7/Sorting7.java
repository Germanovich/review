package by.etc.module2.sorting.task7;

import java.util.Arrays;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Требуется указать места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
 * последовательность так, чтобы новая последовательностьоставалось возрастающией.
 */
public class Sorting7 {
    public static void main(String[] args) {

        int[] array1 = {2, 6, 8, 10, 14};
        int[] array2 = {2, 3, 5, 7, 9, 11, 13};

        int i = 0;
        int j = 0;
        int number = 1;

        System.out.println("1 array: " + Arrays.toString(array1));
        System.out.println("2 array: " + Arrays.toString(array2));

        while (i < array1.length || j < array2.length) {
            if (i < array1.length && j < array2.length) {

                if (array1[i] > array2[j]) {
                    System.out.println(number + ") array2[" + (j + 1) + "]" + " after array1[" + i + "]");
                    number++;
                    if (j < array2.length) {
                        j++;
                    }
                } else {
                    if (i < array1.length) {
                        i++;
                    }
                }
            } else if (j < array2.length) {
                System.out.println(number + ") array2[" + (j + 1) + "] - ... - array2[" + array2.length + "] after array1");
                number++;
                break;
            } else {
                break;
            }
        }
    }
}
