package by.etc.module4.classes_and_objects.task7;

import java.util.Scanner;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы создания объектов, вычисления площади, периметра и
 * точки пересечения медиан.
 */

public class Class7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point");
        System.out.print("x = ");
        double x1 = in.nextDouble();
        System.out.print("y = ");
        double y1 = in.nextDouble();
        System.out.println("Enter the coordinates of the second point");
        System.out.print("x = ");
        double x2 = in.nextDouble();
        System.out.print("y = ");
        double y2 = in.nextDouble();
        System.out.println("Enter the coordinates of the third point");
        System.out.print("x = ");
        double x3 = in.nextDouble();
        System.out.print("y = ");
        double y3 = in.nextDouble();

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        if (triangle.angleA >= 180 || triangle.angleB >= 180 || triangle.angleC >= 180) {
            System.out.println("Failed to build a triangle");
        } else {
            System.out.println("Perimeter of a triangle = " + triangle.p);
            System.out.println("Area of a triangle = " + triangle.s);
            System.out.println("Median intersection point: М (" + triangle.x0 + " : " + triangle.y0 + ")");
        }
    }
}
