package by.etc.module4.classes_and_objects.task4;

import java.util.*;

/**
 * Создайте класс Train, содержаший поля: название пункта назначения, номер поезда, время отправления. Создайте
 * массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте
 * возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массива
 * по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Class4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Train[] info = {
                new Train("Minsk", 400, new int[]{14, 45, 35}),
                new Train("Moscow", 592, new int[]{18, 24, 17}),
                new Train("Warsaw", 758, new int[]{23, 50, 55}),
                new Train("Berlin", 748, new int[]{12, 10, 20}),
                new Train("Berlin", 788, new int[]{14, 45, 45}),
        };

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (info[j].departureTime[0] > info[j + 1].departureTime[0]) {
                    swap(info[j + 1], info[j]);
                } else if (info[j].departureTime[0] == info[j + 1].departureTime[0] &&
                        info[j].departureTime[1] > info[j + 1].departureTime[1]) {
                    swap(info[j + 1], info[j]);
                } else if (info[j].departureTime[0] == info[j + 1].departureTime[0] &&
                        info[j].departureTime[1] == info[j + 1].departureTime[1] &&
                        info[j].departureTime[2] > info[j + 1].departureTime[2]) {
                    swap(info[j + 1], info[j]);
                }
            }
        }

        Arrays.sort(info, Train::compareThem);

        for (int i = 0; i < 5; i++) {
            System.out.print("\n| Destination: " + info[i].destination + " | train number: " + info[i].trainNumber);
            System.out.print(" | time: " + info[i].departureTime[0] + ":" + info[i].departureTime[1] + ":");
            System.out.print(info[i].departureTime[2] + " |");
        }
        System.out.print("\nEnter group number: ");
        int idTrain = in.nextInt();
        for (int i = 0; i < info.length; i++) {
            if (info[i].trainNumber == idTrain) {
                System.out.print("\n| Destination: " + info[i].destination + " | train number: " + info[i].trainNumber);
                System.out.print(" | time: " + info[i].departureTime[0] + ":" + info[i].departureTime[1] + ":");
                System.out.print(info[i].departureTime[2] + " |");
            }
        }
        in.close();
    }

    public static void swap(Train a, Train b) {
        String tempValue = a.destination;
        a.destination = b.destination;
        b.destination = tempValue;

        int tempIndex = a.trainNumber;
        a.trainNumber = b.trainNumber;
        b.trainNumber = tempIndex;

        for (int i = 0; i < 3; i++) {
            int buffer = a.departureTime[i];
            a.departureTime[i] = b.departureTime[i];
            b.departureTime[i] = buffer;
        }
    }
}
