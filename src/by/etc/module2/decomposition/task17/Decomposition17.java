package by.etc.module2.decomposition.task17;

import java.util.Scanner;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т. д. Сколько таких действий
 * гадо произвести, чтобы получился нуль. Для решения задачи использовать декомпозию.
 */

public class Decomposition17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        in.close();
        Decomposition17 workOnNumber = new Decomposition17();
        int check = 0;

        while (number > 0) {
            int sumNumber = workOnNumber.sum(number);
            number -= sumNumber;
            check++;
            System.out.print("\n" + check + ") " + (number + sumNumber) + " - " + sumNumber + " = " + number);
        }
        System.out.print("\n" + check + " actions taken");
    }

    public static int sum(int number) {
        int addition = 0;
        int i = number % 10;
        while (number != 0) {

            addition += i;
            number /= 10;
            i = number % 10;
        }
        return addition;
    }
}
