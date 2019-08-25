package by.etc.module2.arrays_of_arrays.task14;

import java.util.Scanner;

/**
 * Сформировать случайную матрицу MxN, состоящую из нулей и едениц, причем в каждом столбце число едениц равно
 * номеру столбца.
 */

public class ArraysOfArrays14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int line = in.nextInt();
        System.out.print("Input n: ");
        int column = in.nextInt();
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int j = 0; j < column; j++) {
            int number = 0;
            for (int i = 0; i < line; i++) {
                if (number <= j) {
                    matrix1[i][j] = 1;
                    number++;
                } else matrix1[i][j] = 0;
            }
        }
        in.close();

        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }
    }
}