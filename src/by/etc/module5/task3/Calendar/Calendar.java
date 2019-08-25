package by.etc.module5.task3.Calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {

    private int year;
    private ArrayList<Holiday> holidays;
    private LocalDate date;

    public Calendar(int year) {
        setYear(year);
        date = LocalDate.ofYearDay(getYear(), 1);
        holidays = new ArrayList<>();
    }

    private void setYear(int year) {
        if (year < 0) {
            this.year = 0;
        }
        else {
            this.year = year;
        }
    }

    private int getYear() {
        return year;
    }

    public void getHolidays() {
        for (int i = 1; i < date.lengthOfYear(); i++) {
            date = LocalDate.ofYearDay(year, i);
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                addHoliday(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
            }
        }
    }

    public void addHoliday(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        Holiday holiday = new Holiday(date, year);
        holidays.add(holiday);
    }

    public void printHolidays() {
        for (Holiday holiday : holidays) {
            if (date.getYear() == holiday.getYear()) {
                System.out.println(holiday);
            }
        }
    }
    private class Holiday {

        private LocalDate date;
        private int year;

        private Holiday(LocalDate date, int year) {
            this.date = date;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear();
        }
    }
}
