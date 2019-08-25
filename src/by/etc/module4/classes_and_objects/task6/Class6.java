package by.etc.module4.classes_and_objects.task6;

import java.util.Scanner;

/**
 * Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и
 * секунд.
 */

public class Class6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Time clock = new Time();

        boolean cont = true;
        while (cont) {
            System.out.println("1. Enter time");
            System.out.println("2. Add time");
            System.out.println("3. Print time");
            System.out.print("-> ");
            int number = in.nextInt();

            switch (number) {
                case 1: {
                    System.out.print("Enter hour: ");
                    int hour = in.nextInt();
                    clock.setHour(hour);

                    System.out.print("Enter minute: ");
                    int minute = in.nextInt();
                    clock.setMinute(minute);

                    System.out.print("Enter second: ");
                    int second = in.nextInt();
                    clock.setSecond(second);
                    break;
                }
                case 2: {
                    System.out.print("Enter hour: ");
                    int hour = in.nextInt();

                    System.out.print("Enter minute: ");
                    int minute = in.nextInt();

                    System.out.print("Enter second : ");
                    int second = in.nextInt();

                    clock.addTime(hour, minute, second);
                    break;
                }
                case 3: {
                    System.out.print(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
                    System.out.println();
                    break;
                }
                default: {
                    cont = false;
                    System.out.println("number < 1 || number > 3");
                }
            }
        }
        in.close();
    }
}
