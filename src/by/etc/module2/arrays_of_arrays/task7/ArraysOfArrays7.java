package by.etc.module2.arrays_of_arrays.task7;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка N по правилу: A[I, J] = sin((I^2 - J^2)/N) и подсчитать количество
 * положительных элементов в ней.
 */

public class ArraysOfArrays7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        double[][] matrix1;
        matrix1 = new double[line][column];

        int size = line;
        int number = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / size);
                if (matrix1[i][j] >= 0) {
                    number++;
                }
            }
        }

        in.close();

        System.out.println("Number of positive elements: " + number);
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");

            }
            System.out.println();
        }
    }
}