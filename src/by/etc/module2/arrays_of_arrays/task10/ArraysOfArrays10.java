package by.etc.module2.arrays_of_arrays.task10;

import java.util.Scanner;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class ArraysOfArrays10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 10) - 5);
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
            for (int column1 = 0; column1 < column; column1++) {
                if (line1 == column1 && matrix1[line1][column1] > 0) {
                    System.out.print(matrix1[line1][column1] + "\t");
                }
            }
        }
    }
}
