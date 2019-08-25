package by.etc.module2.arrays_of_arrays.task11;

import java.util.Scanner;

/**
 * Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
 * число 5 встречается три и более раз.
 */
public class ArraysOfArrays11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int line = 10;
        int column = 20;
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
            int sum = 0;
            for (int column1 = 0; column1 < column; column1++) {
                if (matrix1[line1][column1] == 5) {
                    sum += 1;
                }
            }
            if (sum >= 3) {
                System.out.print("Line = " + (line1 + 1) + "\t");
            }
        }
    }
}
