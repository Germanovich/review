package by.etc.module2.arrays_of_arrays.task3;

import java.util.Scanner;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class ArraysOfArrays3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input size (NxN): ");
        int line = in.nextInt();
        System.out.print("Input k (line): ");
        int number1 = in.nextInt();
        System.out.print("Input p (column): ");
        int number2 = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 5) - 1);
        }
        in.close();

        System.out.println("");
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }

        if (number1 < line) {
            System.out.print("\nline: ");
            int line1 = number1 - 1;
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        } else System.out.println("Error k >= line");

        if (number2 < column) {
            System.out.print("\ncolumn: ");
            for (int line1 = 0; line1 < line; line1++) {
                int column1 = number2 - 1;
                System.out.print(matrix1[line1][column1] + "\t");
                System.out.println();
            }
        } else System.out.println("Error p >= column");
    }
}
