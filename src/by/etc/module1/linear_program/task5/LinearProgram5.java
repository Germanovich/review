package by.etc.module1.linear_program.task5;

import java.util.Scanner;

/**
 * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 * длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */

class LinearProgram5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input T: ");
        int seconds = in.nextInt();
        in.close();
        int min = 0;
        int hour = 0;

        while (seconds >= 60) {
            seconds = seconds - 60;
            min += 1;
        }
        while (min >= 60) {
            min = min - 60;
            hour += 1;
        }


        System.out.printf("Result: " + hour + "ч " + min + "мин " + seconds + "c");
    }
}
