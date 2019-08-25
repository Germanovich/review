package by.etc.module4.classes_and_objects.task3;

import java.util.Scanner;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти
 * элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 */

public class Class3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student[] person = new Student[10];
        int[] marks = new int[5];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter surname: ");
            String surname = in.nextLine();
            System.out.print("Enter initials (N P): ");
            String initials = in.nextLine();
            System.out.print("Enter group number: ");
            int groupNumber = in.nextInt();
            System.out.print("Enter 5 marks with space: ");

            for (int j = 0; j < 5; j++) {
                marks[j] = in.nextInt();
            }
            in.nextLine();
            person[i] = new Student(surname, initials, groupNumber, marks);
        }
        in.close();

        for (int i = 0; i < 10; i++) {
            boolean check = true;
            for (int j = 0; j < 5; j++) {
                if (person[i].marks[j] < 9) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(person[i].surname + " " + person[i].initials + " group: " + person[i].groupNumber);
            }
        }
    }
}
