package by.etc.module2.arrays_of_arrays.task15;

import java.util.Scanner;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class ArraysOfArrays15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int line = in.nextInt();
        System.out.print("Input n: ");
        int column = in.nextInt();
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
        int maxNumber = 0;
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                if (matrix1[line1][column1] > maxNumber) {
                    maxNumber = matrix1[line1][column1];
                }
            }
        }
        System.out.println("\nMax number = " + maxNumber);
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                if (matrix1[line1][column1] % 2 != 0) {
                    matrix1[line1][column1] = maxNumber;
                }
            }
        }
        System.out.println();
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
    }
}
