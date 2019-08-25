package by.etc.module1.branch_program.task3;

import java.util.Scanner;

/**
 * Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3). Определить, будут ли они расположены на одной прямой.
 */

public class BranchProgram3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x1: ");
        int x1 = in.nextInt();
        System.out.print("Input y1: ");
        int y1 = in.nextInt();
        System.out.print("Input x2: ");
        int x2 = in.nextInt();
        System.out.print("Input y2: ");
        int y2 = in.nextInt();
        System.out.print("Input x3: ");
        int x3 = in.nextInt();
        System.out.print("Input y3: ");
        int y3 = in.nextInt();
        in.close();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.printf("3 points lie on one straight line");
        else System.out.printf("3 points don't lie on one straight line");
    }
}

