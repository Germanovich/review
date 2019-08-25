package by.etc.module1.cycle_program.task7;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме еденицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class CycleProgram7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        in.close();

        int mod;

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a < 0 or b < 0");
        }
        if (b < a) {
            throw new IllegalArgumentException("b < a");
        }

        while (a <= b) {
            System.out.print(a + " - " + "divider = ");
            int number = 2;
            while (number < a) {
                mod = a % number;
                if (mod == 0) {
                    System.out.print(number + " ");
                }
                number++;
            }
            System.out.println();
            a++;
        }
    }
}
