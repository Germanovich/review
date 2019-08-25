package by.etc.module3.regular_expressions.task1;

import java.util.Scanner;
import java.util.Arrays;

public class SortLexemes {
    public void sortLexemes(String text) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input a symbol: ");
        char symbol = in.next(".").charAt(0);
        String stringSimbol = String.valueOf(symbol);

        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[,.]", "");
            words[i] = words[i].toLowerCase();
        }

        int array[] = new int[words.length];

        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            int number = 0;
            String[] buff = words[i].split("");
            for (int j = 0; j < buff.length; j++) {
                System.out.print(buff[j]);
                if (stringSimbol.equals(buff[j])) {
                    number++;
                }
            }
            array[i] = number;
            System.out.println(" - " + array[i]);
        }

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    int bufferInt = array[i];
                    String bufferString = words[i];

                    array[i] = array[i + 1];
                    words[i] = words[i + 1];

                    array[i + 1] = bufferInt;
                    words[i + 1] = bufferString;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            System.out.print(str + " ");
        }
    }
}
