package by.etc.module4.classes_and_objects.task5;

import java.util.Scanner;

/**
 * Опищите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
 * заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние. Написать код,
 * демонстрирующий все возможности класса.
 */

public class Class5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter program = new Counter();
        boolean cont = true;
        while (cont == true) {
            System.out.println("1. Enter date");
            System.out.println("2. Increase the number");
            System.out.println("3. Reduce the number");
            System.out.println("4. Print number");
            System.out.print("-> ");
            int number = in.nextInt();

            switch (number) {
                case 1: {
                    System.out.print("Enter minimum: ");
                    int min = in.nextInt();
                    program.setMin(min);
                    program.setCurrentState(min);

                    System.out.print("Enter maximum: ");
                    int max = in.nextInt();
                    program.setMax(max);

                    System.out.print("Enter step: ");
                    int step = in.nextInt();
                    program.setStep(step);
                    break;
                }
                case 2: {
                    program.increase();
                    break;
                }
                case 3: {
                    program.decrease();
                    break;
                }
                case 4: {
                    System.out.print("Current state = " + program.getCurrentState() + "\n");
                    break;
                }
                default: {
                    cont = false;
                    System.out.println("number < 1 || number > 4");
                }
            }
        }
        in.close();
    }
}
