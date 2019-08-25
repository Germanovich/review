package by.etc.module2.arrays_of_arrays.task5;

import java.util.Scanner;

/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * {1  1  1  ...  1  1  1}
 * {2  2  2  ...  2  2  0}
 * {3  3  3  ...  3  0  0}
 * {.. .. .. ... .. .. ..}
 * {n-1 n-1 0 ... 0  0  0}
 * {n  0  0  ...  0  0  0}
 */

public class ArraysOfArrays5 {
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
        int number1 = 1;
        int size = line;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = number1;
            }
            number1++;
            size--;
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
