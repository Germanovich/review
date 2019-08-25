package by.etc.module2.sorting.task4;

import java.util.Scanner;

/**
 * Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в порядке возрастания. Для этого
 * сравниваются два соседних числа ai и ai+1. Если аi > аi+1, то делается перестановка. Так продолжается до тех пор,
 * пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при
 * этом количества перестановок.
 */

public class Sorting4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int size = in.nextInt();

        int array[] = new int[size];

        int number = 100;
        for (int i = 0; i < size; i++) {
            array[i] = (number);
            number -= 2;
        }

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        in.close();

        int num = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    num++;
                }
            }
        }

        System.out.println();
        System.out.print("Result: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println(num + " permutations");
    }
}
