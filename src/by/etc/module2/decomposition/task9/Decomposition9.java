package by.etc.module2.decomposition.task9;

import java.util.Scanner;

/**
 * Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы) вычисления его площади, если угол
 * между сторонами длиной X и Y - прямой.
 */

public class Decomposition9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        System.out.print("Input z: ");
        int z = in.nextInt();
        System.out.print("Input t: ");
        int t = in.nextInt();

        if (x < 1 || y < 1 || z < 1 || t < 1) {
            throw new IllegalArgumentException("side is less than 0 or = 0");
        }

        Decomposition9 quadrilateral = new Decomposition9();
        double square = quadrilateral.square(z, y, z, t);

        System.out.println("Square = " + square);
    }

    public static double square(int x, int y, int z, int t) {
        int p;

        p = (x + y + z + t) / 2;
        return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
    }
}
