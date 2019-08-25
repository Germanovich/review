package by.etc.module4.classes_and_objects.task1;

import java.util.Scanner;

/**
 * Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы для изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 */

public class Class1 {
    public static void main(String[] args) {
        Test1 tom = new Test1();
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        while (cont == true) {
            System.out.println("1. Display info");
            System.out.println("2. Data change");
            System.out.println("3. Sum of numbers");
            System.out.println("4. Max number");
            System.out.print("-> ");
            int number = in.nextInt();

            switch (number) {
                case 1: {
                    tom.displayInfo();
                    break;
                }
                case 2: {
                    System.out.print("Input number1: ");
                    int number1 = in.nextInt();
                    System.out.print("Input number2: ");
                    int number2 = in.nextInt();
                    tom.dataChange(number1, number2);
                    break;
                }
                case 3: {
                    System.out.print("Sum = " + tom.sumOfNumbers() + "\n");
                    break;
                }
                case 4: {
                    System.out.print("Max number = " + tom.maxNumber() + "\n");
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