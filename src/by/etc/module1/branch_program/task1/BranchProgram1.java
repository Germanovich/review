package by.etc.module1.branch_program.task1;

import java.util.Scanner;

/**
 * Даны два угла треугольника(в градусах). Опеределить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class BranchProgram1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1 angle: ");
        int angle1 = in.nextInt();
        System.out.print("Input the 2 angle: ");
        int angle2 = in.nextInt();
        in.close();
        int angle3;

        if (angle1 + angle2 < 180 && angle1 > 0 && angle2 > 0) {
            System.out.printf("Such a triangle exists ");
            angle3 = 180 - (angle1 + angle2);
            if (angle1 == 90 || angle2 == 90 || angle3 == 90)
                System.out.printf("and it's rectangular");
        } else
            System.out.printf("The triangle does not exist");
    }
}
