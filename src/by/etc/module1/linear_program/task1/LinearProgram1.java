package by.etc.module1.linear_program.task1;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ((a - 3) * b / 2) + c.
 */

public class LinearProgram1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("z = ((a - 3)* b/2) + c");
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        in.close();

        int z = ((a - 3) * b / 2) + c;
        System.out.println("z = ((" + a + " - 3)* " + b + "/2) + " + c + " = " + z);

    }
}