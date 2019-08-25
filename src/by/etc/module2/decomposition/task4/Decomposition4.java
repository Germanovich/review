package by.etc.module2.decomposition.task4;

import java.util.Scanner;

/**
 * На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Decomposition4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of points: ");
        int size = in.nextInt();
        int[][] matrix;
        matrix = new int[size][2];

        if (size < 2) {
            throw new IllegalArgumentException("points less than 2");
        }

        int number = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Input x point " + number + ": ");
                }
                if (j == 1) {
                    System.out.print("Input y point " + number + ": ");
                }
                matrix[i][j] = in.nextInt();
            }
            number++;
        }
        in.close();

        Decomposition4 maximumLength = new Decomposition4();

        System.out.println("x   y");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int array[] = maximumLength.distanse(matrix, size);
        System.out.print("The greatest distance between [" + array[0] + ";" + array[1] + "]");
        System.out.print(" and [" + array[2] + ";" + array[3] + "] - max length = " + array[4]);
    }

    public int[] distanse(int[][] matrix, int size) {
        int array[] = new int[5];
        int x1;
        int y1;
        int x2;
        int y2;
        int r;
        int maxR = 0;

        int i = 0;
        while (i < size) {
            x1 = matrix[i][0];
            y1 = matrix[i][1];
            int j = i + 1;
            while (j < size) {
                x2 = matrix[j][0];
                y2 = matrix[j][1];

                r = (int) Math.abs(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

                if (r > maxR) {
                    maxR = r;

                    array[0] = matrix[i][0];
                    array[1] = matrix[i][1];
                    array[2] = matrix[j][0];
                    array[3] = matrix[j][1];
                    array[4] = maxR;
                }
                j++;
            }
            i++;
        }
        return array;
    }
}
