package by.etc.module2.decomposition.task2;

import java.util.Scanner;

/**
 * Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Decomposition2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int numberA = in.nextInt();
        System.out.print("Input number 2: ");
        int numberB = in.nextInt();
        System.out.print("Input number 3: ");
        int numberC = in.nextInt();
        System.out.print("Input number 4: ");
        int numberD = in.nextInt();
        in.close();

        Decomposition2 greatestCD = new Decomposition2();
        int greatestCommonDivisor1 = greatestCD.greatestCommonDivisor(numberA, numberB);
        int greatestCommonDivisor2 = greatestCD.greatestCommonDivisor(numberC, numberD);
        int result = greatestCD.greatestCommonDivisor(greatestCommonDivisor1, greatestCommonDivisor2);
        System.out.println("Greatest common divisor: " + result);
    }

    public int greatestCommonDivisor(int numberA, int numberB) {
        while (numberA != numberB) {
            if (numberA > numberB) {
                numberA = numberA - numberB;
            } else {
                numberB = numberB - numberA;
            }
        }
        return numberA;
    }
}
