package by.etc.module5.task3;

import by.etc.module5.task3.Calendar.Calendar;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных
 * и праздничных днях.
 */

public class Task3 {
    public static void main(String[] args) {

        int checkYear = 2014;

        Calendar calendar = new Calendar(checkYear);

        calendar.addHoliday(2014, 12, 10);
        calendar.addHoliday(2015, 12, 20);
        calendar.addHoliday(2014, 10, 21);
        calendar.getHolidays();

        calendar.printHolidays();
    }
}

