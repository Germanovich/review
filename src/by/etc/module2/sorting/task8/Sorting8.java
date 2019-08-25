package by.etc.module2.sorting.task8;

import java.util.Scanner;

/**
 * Даны дроби p1 / q1, p2 / q2, ..., pn / qn (pi, qi - натуральные). Составьте программу, которая приводит эти дроби
 * к общему знаменателяю и упорядочивает их в порядке возрастания.
 */
public class Sorting8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of fractions: ");
        int number = in.nextInt();
        in.close();

        int[] numenatorArray = new int[number];
        int[] denumenatorArray = new int[number];

        int i;
        int j;

        for (i = 0; i < numenatorArray.length; i++) {
            numenatorArray[i] = (int) (Math.random() * 6 + 1);
        }

        for (i = 0; i < denumenatorArray.length; i++) {
            denumenatorArray[i] = (int) (Math.random() * 12 + 1);
        }

        System.out.print("Fractions: ");
        for (i = 0; i < numenatorArray.length; i++) {
            System.out.print(numenatorArray[i] + "/" + denumenatorArray[i] + " ");
        }

        for (i = 0; i < numenatorArray.length; i++) {
            for (j = 0; j < denumenatorArray.length; j++) {
                if (i != j) {
                    numenatorArray[i] *= denumenatorArray[j];
                }
            }
        }

        // общий знаменатель
        int totalDenominator = 1;
        for (j = 0; j < denumenatorArray.length; j++) {
            totalDenominator *= denumenatorArray[j];

        }
        for (i = 0; i < denumenatorArray.length; i++) {
            denumenatorArray[i] = totalDenominator;
        }

        System.out.println();
        System.out.print("Converted fractions: ");
        for (i = 0; i < numenatorArray.length; i++) {
            System.out.print(numenatorArray[i] + "/" + denumenatorArray[i] + " ");
        }


        for (i = 0; i < numenatorArray.length - 1; i++) {
            int change;
            if (i > 0) {
                if (numenatorArray[i] > numenatorArray[i + 1]) {
                    change = numenatorArray[i];
                    numenatorArray[i] = numenatorArray[i + 1];
                    numenatorArray[i + 1] = change;
                    i -= 2;
                }
            } else {
                if (numenatorArray[i] > numenatorArray[i + 1]) {
                    change = numenatorArray[i];
                    numenatorArray[i] = numenatorArray[i + 1];
                    numenatorArray[i + 1] = change;
                }
            }
        }

        System.out.println();
        System.out.print("Result with a common denominator: ");
        for (i = 0; i < numenatorArray.length; i++) {
            System.out.print(numenatorArray[i] + "/" + denumenatorArray[i] + " ");
        }

        System.out.println();
        System.out.print("Result: ");
        for (i = 0; i < numenatorArray.length; i++) {
            int nod = getNod(numenatorArray[i], denumenatorArray[i]);
            System.out.print(numenatorArray[i] / nod + "/" + denumenatorArray[i] / nod + " ");
        }
    }

    private static int getNod(int numenator, int denumenator) {
        do {
            if (numenator > denumenator) {
                numenator %= denumenator;
            } else {
                denumenator %= numenator;
            }
        } while (numenator * denumenator > 0);
        return (numenator + denumenator);
    }
}
