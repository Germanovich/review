package by.etc.module1.linear_program.task4;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой части). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearProgram4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number in format nnn,ddd: ");
        double r = in.nextDouble();
        in.close();

        double left;
        double right;
        left = (int) r;
        right = (r - left) * 1000;
        left = left / 1000;
        double result = right + left;


        System.out.printf("Result: " + "%3.3f", result);
    }
}
