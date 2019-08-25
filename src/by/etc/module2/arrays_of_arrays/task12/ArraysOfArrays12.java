package by.etc.module2.arrays_of_arrays.task12;

import java.util.Scanner;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class ArraysOfArrays12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 16));
        }
        in.close();

        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int line1 = 0; line1 < line; line1++) {
            for (int i = column - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix1[line1][j] > matrix1[line1][j + 1]) {
                        int buffer = matrix1[line1][j];
                        matrix1[line1][j] = matrix1[line1][j + 1];
                        matrix1[line1][j + 1] = buffer;
                    }
                }
            }
        }
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int line1 = 0; line1 < line; line1++) {
            for (int i = column - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix1[line1][j] < matrix1[line1][j + 1]) {
                        int buffer = matrix1[line1][j];
                        matrix1[line1][j] = matrix1[line1][j + 1];
                        matrix1[line1][j + 1] = buffer;
                    }
                }
            }
        }
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
    }
}
