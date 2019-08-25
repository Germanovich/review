package by.etc.module2.sorting.task3;

import java.util.Scanner;

/**
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * и ставится на первое место, а первый - на место наибольшего. Затем начиная со втрого, это процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

public class Sorting3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int size = in.nextInt();

        int array[] = new int[size];

        int number = 1;
        for (int i = 0; i < size; i++) {
            array[i] = (number + 2);
            number += 2;
        }

        System.out.println();
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        in.close();

        for (int i = 0; i < array.length; i++) {

            int max = array[i];
            int max_i = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }

            if (i != max_i) {
                int buffer = array[i];
                array[i] = array[max_i];
                array[max_i] = buffer;
            }
        }

        System.out.println();
        System.out.print("Result: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
