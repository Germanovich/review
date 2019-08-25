package by.etc.module1.cycle_program.task5;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
 * an = 1 / 2^n + 1 / 3^n;
 */
public class CycleProgram5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input h: ");
        int h = in.nextInt();
        System.out.print("Input e: ");
        int e = in.nextInt();
        in.close();

        int n = a;
        double an;
        double sum = 0;

        if (b < a) {
            throw new IllegalArgumentException("b<a");
        }
        while (n <= b) {
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(an) >= e) {
                sum += an;
            }
            n += h;
        }
        System.out.println("Sum = " + sum);
    }
}
