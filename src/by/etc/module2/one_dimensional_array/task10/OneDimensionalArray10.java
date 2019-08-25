package by.etc.module2.one_dimensional_array.task10;

import java.util.Scanner;

/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями). Примечание. Дополнительный элемент не использовать.
 */

public class OneDimensionalArray10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 5) - 1);
            System.out.println(array[i]);
        }
        in.close();

        for (int i = 1; i < size; i += 2) {
            array[i] = 0;
        }

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
