package by.etc.module2.decomposition.task13;

import java.util.Scanner;

/**
 * Два просты числа называются близнецами, если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
 * напечатать все пары близнецов из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class Decomposition13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = in.nextInt();
        int size = n * 2 - n + 1;
        int array[] = new int[size];
        in.close();

        if (n < 3) {
            throw new IllegalArgumentException("n < 3");
        }

        Decomposition13 twin = new Decomposition13();

        int number = n;
        for (int i = 0; i < size; i++) {
            array[i] = number;
            number++;
        }

        for (int i = 0; i < size; i++) {
            if (twin.check(array[i], array[size - 1]) == true) {
                System.out.println(array[i] + " - " + array[i + 2]);
            } else {
                continue;
            }
        }
    }


    public static boolean check(int number, int maxNumber) {
        if (number + 2 <= maxNumber) {
            return true;
        } else {
            return false;
        }
    }

}
