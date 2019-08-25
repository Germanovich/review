package by.etc.module2.arrays_of_arrays.task8;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит пользователь с
 * клавиатуры.
 */

public class ArraysOfArrays8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int column = line;
        int[][] matrix1;
        matrix1 = new int[line][column];
        int array[] = new int[line];
        System.out.print("First column: ");
        int firstColumn = in.nextInt();
        System.out.print("Second column: ");
        int secondColumn = in.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                matrix1[i][j] = ((int) (Math.random() * 10) - 1);
        }
        in.close();

        System.out.println();
        for (int line1 = 0; line1 < line; line1++) {
            for (int column1 = 0; column1 < column; column1++) {
                System.out.print(matrix1[line1][column1] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < line; i++) {
            array[i] = matrix1[i][firstColumn - 1];
        }

        for (int i = 0; i < line; i++) {
            matrix1[i][firstColumn - 1] = matrix1[i][secondColumn - 1];
        }

        for (int i = 0; i < line; i++) {
            matrix1[i][secondColumn - 1] = array[i];
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
