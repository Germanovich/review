package by.etc.module2.decomposition.task16;

import by.etc.module2.decomposition.task10.Decomposition10;

import java.util.Scanner;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
 * сколько четных цифр было найдено в сумме. Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {
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
        int sum = 0;
        int array2[] = new int[k];

        for (int i = 0; i < number - num; i++) {
            array2 = workOnNumber.separation(array1[i], array2);
            boolean check = test1(array2);

            if (check == true) {
                System.out.print(array1[i] + " ");
                sum += array1[i];
            }
        }
        System.out.print("\nSum = " + sum);
        int length = workOnNumber.quantity(sum);
        System.out.print("\nSum length = " + length);
        int array3[] = new int[length];
        array3 = workOnNumber.separation(sum, array3);
        int evenNumber = test2(array3);
        System.out.print("\nNumber of even numbers = " + evenNumber);
    }

    public static boolean test1(int[] array) {
        int j = 0;
        boolean check = false;
        while (j < array.length) {
            if (array[j] % 2 != 0) {
                check = true;
                j++;
            } else {
                check = false;
                break;
            }

        }
        return check;
    }

    public static int test2(int[] array) {
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                j++;
            }
            i++;
        }
        return j;
    }
}
