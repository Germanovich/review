package by.etc.module4.classes_and_objects.task10;

import java.util.Arrays;

class Airline {
    public int[] time = new int[3];
    private String destination;
    private int flightNumber;
    private String aircraftType;
    public String[] daysOfTheWeek = new String[7];

    Airline(String destination, int flightNumber, String aircraftType, int[] time, String[] daysOfTheWeek) {
        setDestination(destination);
        setFlightNumber(flightNumber);
        setAircraftType(aircraftType);
        for (int i = 0; i < time.length; i++) {
            this.time[i] = time[i];
        }
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            this.daysOfTheWeek[i] = daysOfTheWeek[i];
        }
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    private void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    private void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    int getFlightNumber() {
        return flightNumber;
    }

    String getAircraftType() {
        return aircraftType;
    }


    String getDestination() {
        return destination;
    }

    public String toString() {
        return String.format("Destination: %-10s flight number: %-7s aircraft kind: %-7s time: %d:%d:%-7d" +
                        "days of the week: %s", getDestination(), getFlightNumber(), getAircraftType(),
                time[0], time[1], time[2], Arrays.asList(daysOfTheWeek));
    }
}
