package by.etc.module2.decomposition.task14;

import by.etc.module2.decomposition.task10.Decomposition10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в
 * степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения этой задачи использовать
 * декомпозицию.
 */

public class Decomposition14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input K: ");
        int k = in.nextInt();
        in.close();

        int[] array = getNumber(k);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] getNumber(int N) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <= N; i++) {
            if (sum(i) == i) {
                list.add(i);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        list.clear();
        return result;
    }

    public static int sum(int number) {
        Decomposition10 workOnNumber = new Decomposition10();
        int addition = 0;
        int amount = workOnNumber.quantity(number);
        int i = number % 10;
        while (number != 0) {

            addition += Math.pow(i, amount);
            number /= 10;
            i = number % 10;
        }
        return addition;
    }
}
