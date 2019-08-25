package by.etc.module2.arrays_of_arrays.task4;

import java.util.Scanner;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
 * {1  2   3  ... n}
 * {n n-1 n-2 ... 1}
 * {1  2   3  ... n}
 * {n n-1 n-2 ... 1}
 * {. ... ... ... .}
 * {n n-1 n-2 ... 1}
 */

public class ArraysOfArrays4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        if (line % 2 != 0) {
            throw new IllegalArgumentException("odd number");
        }

        for (int i = 0; i < line; i += 2) {
            int number1 = 1;
            for (int j = 0; j < line; j++) {
                matrix1[i][j] = number1;
                number1++;
            }
        }
        for (int i = 1; i < line; i += 2) {
            int size = line;
            for (int j = 0; j < line; j++) {
                matrix1[i][j] = size;
                size--;
            }
        }
        in.close();

        System.out.println();
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
    }
}