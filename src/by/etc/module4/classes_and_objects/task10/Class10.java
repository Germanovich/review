package by.etc.module4.classes_and_objects.task10;

import java.util.List;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * б) список рейсов для заданного дня недели;
 * в) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Class10 {
    public static void main(String[] args) {
        Flight infoAirline = new Flight();
        infoAirline.add(new Airline("Berlin", 415, "A320", new int[]{10, 30, 55},
                new String[]{"Monday", "Wednesday", "Friday"}));

        infoAirline.add(new Airline("Moscow", 457, "A330", new int[]{14, 25, 10},
                new String[]{"Wednesday", "Thursday", "Saturday"}));

        infoAirline.add(new Airline("Cairo", 547, "A320", new int[]{8, 15, 19},
                new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));

        infoAirline.add(new Airline("Paris", 358, "Il-62", new int[]{18, 17, 37},
                new String[]{"Monday", "Tuesday", "Thursday", "Friday",}));

        infoAirline.add(new Airline("London", 147, "Il-62", new int[]{20, 18, 0},
                new String[]{"Tuesday", "Thursday", "Saturday", "Sunday"}));

        infoAirline.add(new Airline("Washington", 785, "A320", new int[]{4, 47, 57},
                new String[]{"Monday", "Tuesday", "Thursday", "Friday", "Sunday"}));

        infoAirline.add(new Airline("Tokyo", 457, "Ty-204", new int[]{11, 12, 13},
                new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));

        infoAirline.add(new Airline("Paris", 368, "A320", new int[]{15, 50, 40},
                new String[]{"Tuesday", "Wednesday", "Friday", "Sunday"}));

        infoAirline.add(new Airline("London", 455, "A330", new int[]{17, 36, 54},
                new String[]{"Tuesday", "Wednesday", "Thursday", "Friday", "Sunday"}));


        System.out.println("\nSort by destination:");
        List<Airline> listSortByDestination = infoAirline.getListDestination("Paris");
        for (Airline c : listSortByDestination) {
            System.out.println(c);
        }

        System.out.println("\nSort by day:");
        List<Airline> listSortByDaysOfTheWeek = infoAirline.getListDaysOfTheWeek("Monday");
        for (Airline c : listSortByDaysOfTheWeek) {
            System.out.println(c);
        }
        System.out.println("\nSort by day and time:");
        int[] checkTime = new int[]{15, 0, 0};
        List<Airline> listSortByDaysOfTheWeekAndTime = infoAirline.getListDaysAndTime("Monday", checkTime);
        for (Airline c : listSortByDaysOfTheWeekAndTime) {
            System.out.println(c);
        }
    }
}
