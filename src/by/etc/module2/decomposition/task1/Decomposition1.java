package by.etc.module2.decomposition.task1;

import java.util.Scanner;

/**
 * Написать метод(методы)для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: (НОК(А, В) = А * В / НОД(А, В))
 */

public class Decomposition1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        in.close();

        Decomposition1 leastCM = new Decomposition1();
        int greatestCommonDivisor = leastCM.greatestCommonDivisor(A, B);
        int leastCommonMultiple = leastCM.leastCommonMultiple(A, B, greatestCommonDivisor);
        System.out.println("Greatest common divisor: " + greatestCommonDivisor);
        System.out.println("Least common multiple: " + leastCommonMultiple);
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

    public int leastCommonMultiple(int numberA, int numberB, int divisor) {
        return numberA * numberB / divisor;
    }
}
