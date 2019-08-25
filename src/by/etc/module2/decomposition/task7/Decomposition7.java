package by.etc.module2.decomposition.task7;

/**
 * Написать метод (методы) для вычисления суммы факториалов все нечетных чисел от 1 до 9.
 */

public class Decomposition7 {
    public static void main(String[] args) {

        Decomposition7 factorialSum = new Decomposition7();
        int number = 1;
        int sum = 0;
        while (number <= 9) {
            sum += factorialSum.factorial(number);
            number += 2;
        }
        System.out.println("Result: " + sum);
    }

    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) {
            ret *= i;
        }
        return ret;
    }
}
