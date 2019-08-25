package by.etc.module2.arrays_of_arrays.task16;

import java.util.Scanner;

/**
 * 16. Магическим квадратом порядка N называется матрица размера NxN, составленная из числе 1, 2, 3, ..., N^2 так,
 * что по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
 * Пример магического квадрата порядка 3:
 * {6 1 8}
 * {7 5 3}
 * {2 9 4}
 */

public class ArraysOfArrays16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n (NxN): ");
        int line = in.nextInt();
        int[][] matrix;
        matrix = new int[line][line];
        in.close();

        int cons;
        boolean LineFlag;
        boolean ColumnFlag;
        boolean diagonalFlag1;
        boolean diagonalFlag2;


        cons = line * (line * line + 1) / 2;
        System.out.println("const = " + cons);

        for (int infinity = 1; infinity > 0; infinity++) {

            do {

                ArraysOfArrays16.GenerateArray(matrix);
                LineFlag = ArraysOfArrays16.LineCheck(matrix, cons, line);
                ColumnFlag = ColumnCheck(matrix, cons, line);
                diagonalFlag1 = ArraysOfArrays16.DiagonalCheck1(matrix, cons, line);
                diagonalFlag2 = ArraysOfArrays16.DiagonalCheck2(matrix, cons, line);

            } while (LineFlag == true || diagonalFlag1 == true || diagonalFlag2 == true || ColumnFlag == true);


            ArraysOfArrays16.PrintArray(matrix);
        }
    }

    public static void PrintArray(int matrix[][]) {

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void GenerateArray(int matrix[][]) {
        int buffer;
        matrix[0][0] = ((int) (Math.random() * (Math.pow(matrix.length, 2))) + 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                buffer = ((int) (Math.random() * (Math.pow(matrix.length, 2))) + 1);

                for (int ii = 0; ii < matrix.length; ii++) {
                    for (int jj = 0; jj < matrix.length; jj++) {

                        if (buffer == matrix[0][0]) {
                            buffer = ((int) (Math.random() * (Math.pow(matrix.length, 2))) + 1);
                        }

                        if (buffer == matrix[ii][jj]) {
                            buffer = ((int) (Math.random() * (Math.pow(matrix.length, 2))) + 1);
                            jj = 0;
                            ii = 0;
                        }
                    }
                }
                matrix[i][j] = buffer;
            }
        }
    }

    public static boolean LineCheck(int matrix[][], int cons, int line) {

        int check = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            if (sum == cons) {
                check++;
            }
        }
        if (check == line) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean ColumnCheck(int matrix[][], int cons, int line) {

        int check = 0;
        for (int j = 0; j < matrix.length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            if (sum == cons) {
                check++;
            }
        }
        if (check == line) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean DiagonalCheck1(int matrix[][], int cons, int line) {

        int sum = 0;
        int i = 0;

        while (i < line) {
            sum += matrix[i][i];
            i++;
        }
        if (sum == cons) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean DiagonalCheck2(int matrix[][], int cons, int line) {

        int sum = 0;
        int i = 0;
        int j = matrix.length - 1;
        while (i < matrix.length && j >= 0) {
            sum += matrix[i][j];
            i++;
            j--;
        }
        if (sum == cons) {
            return false;
        } else {
            return true;
        }
    }
}
