package by.etc.module2.decomposition.task3;

import java.util.Scanner;

/**
 * Вычислить площадь правильного шестиугольника со стороной A, используя метод вычисления площади треугольника.
 */

public class Decomposition3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int line = in.nextInt();
        in.close();

        Decomposition3 hexagon = new Decomposition3();
        System.out.println("Result: " + hexagon.square(line) * 6 + " (units in a square)");
    }

    public double square(int line) {
        return Math.pow(line, 2) * Math.sqrt(3) / 4;
    }
}
