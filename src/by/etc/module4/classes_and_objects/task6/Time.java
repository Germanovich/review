package by.etc.module4.classes_and_objects.task6;

class Time {
    int hour;
    int minute;
    int second;

    Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    void setHour(int hour) {
        if (hour < 24 && hour > 0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    void setMinute(int minute) {
        if (minute < 60 && minute > 0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    void setSecond(int second) {
        if (second < 60 && second > 0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }

    void addTime(int addHour, int addMinute, int addSecond) {
        second += addSecond;
        while (second >= 60) {
            second -= 60;
            minute++;
        }
        minute += addMinute;
        while (minute >= 60) {
            minute -= 60;
            hour++;
        }
        hour += addHour;
        while (hour >= 24) {
            hour -= 24;
        }
    }
}
