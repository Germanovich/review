package by.etc.module2.arrays_of_arrays.task1;

import java.util.Scanner;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class ArraysOfArrays1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of line: ");
        int line = in.nextInt();
        System.out.print("Input the number of columns: ");
        int column = in.nextInt();
        int[][] matrix1;
        matrix1 = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 5) - 1);
        }
        in.close();


        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j += 2) {
                if (matrix1[0][j] > matrix1[line - 1][j]) {

                    System.out.print(matrix1[i][j] + "\t");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
