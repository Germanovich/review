package by.etc.module2.sorting.task5;

import java.util.Arrays;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2, ..., ai. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <= ... <= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью
 * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Sorting5 {
    public static void main(String[] args) {

        int[] array = {1, 6, 7, 11, 10, 12, 5, 0};

        System.out.println(Arrays.toString(array));
        InsertionSort(array);
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static int[] doubleSearch(int number, int[] array) {
        int left = 0;
        int right = number;
        int midle;
        int border = -1;
        do {
            midle = (left + right) / 2;
            if (array[number + 1] < array[midle]) {
                right = midle;
            } else if (array[number + 1] > array[midle]) {
                left = midle;
            } else {
                border = midle + 1;
                break;
            }
        } while (right - left > 1);

        if (array[number + 1] < array[left]) {
            border = left;
        } else if (border == -1) {
            border = left + 1;
        }

        int buffer;
        for (int i = number + 1; i > border; i--) {
            buffer = array[i];
            array[i] = array[i - 1];
            array[i - 1] = buffer;
        }
        return array;
    }

    public static int[] InsertionSort(int[] array) {

        int checkNumber = 0;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    checkNumber = i;
                    break;
                }
            }
            doubleSearch(checkNumber, array);
        } while (checkNumber != array.length - 2);
        return array;
    }
}
