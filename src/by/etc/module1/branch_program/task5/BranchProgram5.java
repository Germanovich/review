package by.etc.module1.branch_program.task5;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 *       {x^2 - 3x + 9, если x <= 3
 * F(x)= {
 *       {1 / (x^3 + 6), если x > 3
 */

public class BranchProgram5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextInt();
        in.close();

        double result;

        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
            System.out.printf("F(x) = " + result);
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("F(x) = " + "%5.5f", result);
        }
    }
}
