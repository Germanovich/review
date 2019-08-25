package by.etc.module2.decomposition.task11;

import by.etc.module2.decomposition.task10.Decomposition10;

import java.util.Scanner;

/**
 * Написать метод (методы), определющий, в каком из заданных двух чисел больше цифр.
 */

public class Decomposition11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int number1 = in.nextInt();
        System.out.print("Input number 2: ");
        int number2 = in.nextInt();
        in.close();

        Decomposition10 number = new Decomposition10();
        number1 = number.quantity(number1);
        number2 = number.quantity(number2);

        int check = size(number1, number2);

        if (check == 0) {
            System.out.println("First number have more numbers");
        } else if (check == 1) {
            System.out.println("Second number have more numbers");
        } else if (check == 2) {
            System.out.println("Numbers in the first number and in the second equals");
        }
    }

    public static int size(int number1, int number2) {
        if (number1 > number2) {
            return 0;
        } else if (number1 < number2) {
            return 1;
        } else {
            return 2;
        }
    }
}
