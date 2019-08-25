package by.etc.module2.sorting.task6;

import java.util.Arrays;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это
 * следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент
 * вперед. Если ai > ai+1, то проивзодится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой
 * сортировки.
 */

public class Sorting6 {
    public static void main(String[] args) {

        int[] array = {1, 6, 7, 11, 10, 12, 5, 0};

        System.out.println(Arrays.toString(array));
        sortShell(array);
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static int[] sortShell(int[] array) {
        int j;
        int step = array.length / 2;
        while (step > 0) {
            for (int i = 0; i < (array.length - step); i++) {
                j = i;
                while ((j >= 0) && (array[j] > array[j + step])) {
                    int buffer;

                    buffer = array[j];
                    array[j] = array[j + step];
                    array[j + step] = buffer;

                    j = j - step;
                }
            }
            System.out.println(Arrays.toString(array));
            step = step / 2;
        }
        return array;
    }
}
