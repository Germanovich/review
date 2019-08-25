package by.etc.module1.linear_program.task6;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
 * принадлежит закрашенной области, и false - в противном случае.
 */

public class LinearProgram6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        in.close();
        String check;

        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            check = "true";
        } else if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            check = "true";
        } else check = "false";


        System.out.printf("Result: " + check);
    }
}
