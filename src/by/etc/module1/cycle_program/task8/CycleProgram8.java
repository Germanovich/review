package by.etc.module1.cycle_program.task8;

import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class CycleProgram8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number1: ");
        int number1 = in.nextInt();
        System.out.print("Input number2: ");
        int number2 = in.nextInt();
        in.close();

        if (number1 < 0 || number2 < 0) {
            throw new IllegalArgumentException("number1 < 0 or number2 < 0");
        }

        int twin;
        int mun2;

        while (number1 > 0) {
            twin = number1 % 10;
            number1 = number1 / 10;
            mun2 = number2;

            while (mun2 > 0) {
                if (mun2 % 10 == twin) {
                    System.out.print(twin + " ");
                }
                mun2 = mun2 / 10;
            }
        }
        System.out.println(" ");
    }
}
