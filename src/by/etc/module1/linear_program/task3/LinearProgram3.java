package by.etc.module1.linear_program.task3;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sin x + cos y)/ (cos x - sin y) * tg xy.
 */

public class LinearProgram3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextInt();
        System.out.print("Input y: ");
        double y = in.nextInt();
        in.close();

        double mathExpression = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("mathExpression = " + "%5.3f", mathExpression);
    }
}
