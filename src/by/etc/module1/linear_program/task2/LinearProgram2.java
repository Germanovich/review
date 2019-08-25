package by.etc.module1.linear_program.task2;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * b + sqrt(b^2 + 4ac)/2a - a^3c + b^-2.
 */

public class LinearProgram2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextInt();
        System.out.print("Input b: ");
        double b = in.nextInt();
        System.out.print("Input c: ");
        double c = in.nextInt();
        in.close();

        double mathExpression = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("mathExpession = " + "%10.3f", mathExpression);

    }
}
