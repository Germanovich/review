package by.etc.module4.classes_and_objects.task10;

import java.util.ArrayList;
import java.util.List;

class Flight {
    private ArrayList<Airline> AirlineList = new ArrayList<>();

    void add(Airline airline) {
        AirlineList.add(airline);
    }

    List<Airline> getListDestination(String destinationCheck) {
        List<Airline> list1 = new ArrayList<>();
        for (Airline c : AirlineList) {
            if (c.getDestination() == destinationCheck) {
                list1.add(c);
            }
        }
        return list1;
    }

    List<Airline> getListDaysOfTheWeek(String dayCheck) {
        List<Airline> list2 = new ArrayList<>();
        for (Airline c : AirlineList) {
            for (int i = 0; i < 7; i++) {
                if (c.daysOfTheWeek[i] == dayCheck) {
                    list2.add(c);
                    break;
                }
            }
        }
        return list2;
    }

    List<Airline> getListDaysAndTime(String dayCheck, int[] checkTime) {
        List<Airline> list3 = new ArrayList<>();
        for (Airline c : AirlineList) {
            for (int i = 0; i < 7; i++) {
                if (c.daysOfTheWeek[i] == dayCheck) {
                    if (checkTime[0] < c.time[0]) {
                        if (checkTime[1] < c.time[1]) {
                            if (checkTime[2] < c.time[2]) {
                                list3.add(c);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return list3;
    }
}