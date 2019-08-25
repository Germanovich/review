package by.etc.module1.branch_program.task2;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */

public class BranchProgram2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input d: ");
        int d = in.nextInt();
        in.close();

        int result;
        int min1;
        int min2;

        min1 = a < b ? a : b;
        min2 = c < d ? c : d;
        result = min1 > min2 ? min1 : min2;

        System.out.printf("Result: " + result);
    }
}
