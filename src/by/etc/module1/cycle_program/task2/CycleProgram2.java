package by.etc.module1.cycle_program.task2;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [a, b] с шагом h:
 *      {x, x > 2
 * y =  {
 *      {-x. x <= 2
 */

public class CycleProgram2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input h: ");
        int h = in.nextInt();
        in.close();

        int step = a;
        double x;
        int step2 = 0;
        double y;

        if (b < a) {
            throw new IllegalArgumentException("b<a");
        }
        while (step <= b) {
            x = a + step2 * h;
            if (x > 2) {
                y = x;
                System.out.println("step " + step + " - " + y);
            } else {
                y = -x;
                System.out.println("step " + step + " - " + y);
            }
            step2++;
            step += h;
        }
    }
}
