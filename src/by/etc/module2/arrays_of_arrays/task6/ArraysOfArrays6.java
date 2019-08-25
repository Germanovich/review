package by.etc.module2.arrays_of_arrays.task6;

import java.util.Scanner;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу (n-четное):
 * {1  1  1 ... 1  1  1}
 * {0  1  1 ... 1  1  0}
 * {0  0  1 ... 1  0  0}
 * {.  .  . ... .  .  .}
 * {0  1  1 ... 1  1  0}
 * {1  1  1 ... 1  1  1}
 */

public class ArraysOfArrays6 {
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

        int size = line;
        int number2 = 0;
        int search = size / 2;
        for (int i = 0; i < line; i++) {
            System.out.println(search);
            int number1 = 1;
            if (i <= search + 1) {
                for (int j = number2; j < size; j++) {
                    matrix1[i][j] = number1;
                }
                if (i < search) {
                    number2++;
                    size--;
                }
            }
            if (i >= search) {
                number2--;
                size++;
                for (int j = number2; j < size; j++) {
                    matrix1[i][j] = number1;
                }
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
