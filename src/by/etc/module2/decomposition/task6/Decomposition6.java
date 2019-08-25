package by.etc.module2.decomposition.task6;

import by.etc.module2.decomposition.task1.Decomposition1;

import java.util.Scanner;

/**
 * Написать метод (методы), проверяющий, являются ли заданные три числа взаимно простыми.
 */

public class Decomposition6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = in.nextInt();
        System.out.print("Input B: ");
        int b = in.nextInt();
        System.out.print("Input C: ");
        int c = in.nextInt();
        in.close();

        boolean check = result(a, b, c);
        if (check == true) {
            System.out.println("These three numbers are mutually simple");
        } else {
            System.out.println("These three numbers are not mutually simple");
        }
    }

    public static boolean result(int a, int b, int c) {
        Decomposition1 greatestCD = new Decomposition1();

        int greatestCommonDivisor1 = greatestCD.greatestCommonDivisor(a, b);
        int greatestCommonDivisor2 = greatestCD.greatestCommonDivisor(b, c);
        int greatestCommonDivisor3 = greatestCD.greatestCommonDivisor(a, c);

        if (greatestCommonDivisor1 == 1 && greatestCommonDivisor2 == 1 && greatestCommonDivisor3 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
