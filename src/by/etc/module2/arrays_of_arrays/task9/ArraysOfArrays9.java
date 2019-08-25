package by.etc.module2.arrays_of_arrays.task9;

import java.util.Scanner;

/**
 * Задана матрица неотрецательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
 * содержит максимальную сумму.
 */

public class ArraysOfArrays9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        int maxColumn = 0;
        int nameColumn = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 10));
        }
        in.close();

        for (int j = 0; j < column; j++) {
            int numberColumn = 0;
            for (int i = 0; i < line; i++) {
                numberColumn += matrix1[i][j];
            }
            if (numberColumn > maxColumn) {
                maxColumn = numberColumn;
                nameColumn = j + 1;
            }
        }

        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");

            }
            System.out.println();

        }
        System.out.println("Maximum value in column = " + nameColumn);
    }
}
