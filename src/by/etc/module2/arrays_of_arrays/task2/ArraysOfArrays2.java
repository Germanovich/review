package by.etc.module2.arrays_of_arrays.task2;

import java.util.Scanner;

/**
 * Дана квадратная матрица. Вывести на экран элементы стоящие по диагонали.
 */

public class ArraysOfArrays2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input size (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 5) - 1);
        }
        in.close();


        int i = 0;
        int j = 0;
        System.out.print("Result: ");
        while (i < line && j < column) {
            System.out.print(matrix1[i][j] + " ");
            i++;
            j++;
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
