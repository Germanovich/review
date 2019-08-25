package by.etc.module1.cycle_program.task1;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1
 * до введенного числа.
 */

public class CycleProgram1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        in.close();

        int result = 0;

        if (number <= 0) {
            throw new IllegalArgumentException("Number: " + number + "<=0");
        }
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        System.out.printf("Result: " + result);

    }
}
