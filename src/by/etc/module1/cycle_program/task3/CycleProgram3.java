package by.etc.module1.cycle_program.task3;

import java.util.Scanner;

/**
 * Найти сумму квадратов первых ста чисел.
 */

public class CycleProgram3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Initial number: ");
        int number = in.nextInt();
        in.close();

        int end = number + 100;
        double pow;
        int result = 0;

        while (number <= end) {
            pow = Math.pow(number, 2);
            result += pow;
            number++;
        }
        System.out.println("Result: " + result);
    }
}
