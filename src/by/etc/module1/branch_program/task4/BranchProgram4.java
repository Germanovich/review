package by.etc.module1.branch_program.task4;

import java.util.Scanner;

/**
 * Заданы размеры А, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич
 * через отверстие.
 */

public class BranchProgram4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        System.out.print("Input z: ");
        int z = in.nextInt();

        if (x <= A && y <= B)
            System.out.printf("Yes, it will pass");
        else if (y <= A && x <= B)
            System.out.printf("Yes, it will pass");
        else if (x <= A && z <= B)
            System.out.printf("Yes, it will pass");
        else if (z <= A && x <= B)
            System.out.printf("Yes, it will pass");
        else if (z <= A && y <= B)
            System.out.printf("Yes, it will pass");
        else if (y <= A && z <= B)
            System.out.printf("Yes, it will pass");
        else System.out.printf("No, it will not pass");
        in.close();


    }
}
