package by.etc.module2.decomposition.task15;

import by.etc.module2.decomposition.task10.Decomposition10;

import java.util.Scanner;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например,
 * 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Decomposition15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Which n-digit system to output? -> ");
        int k = in.nextInt();
        in.close();

        int number = 1;
        for (int i = 0; i < k; i++) {
            number *= 10;
        }
        int num = (number) / 10;
        int array1[] = new int[number - num];

        int buffer = num;
        for (int i = 0; i < number - num; i++) {
            array1[i] = buffer;
            buffer++;
        }

        Decomposition10 workOnNumber = new Decomposition10();
        int array2[] = new int[k];
        for (int i = 0; i < number - num; i++) {
            array2 = workOnNumber.separation(array1[i], array2);
            boolean check = test(array2);

            if (check == true) {
                System.out.print(array1[i] + " ");
            }
        }
    }

    public static boolean test(int[] array) {
        int j = 0;
        boolean check = false;
        while (j < array.length - 1) {
            if (array[j] > array[j + 1]) {
                check = true;
                j++;
            } else {
                check = false;
                break;
            }

        }
        return check;
    }
}
