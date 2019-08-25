package by.etc.module4.classes_and_objects.task4;

class Train {
    String destination;
    int trainNumber;
    int[] departureTime = new int[3];

    Train(String destination, int trainNumber, int[] departureTime) {
        this.destination = destination.substring(0, 1).toUpperCase() + destination.substring(1);
        this.trainNumber = trainNumber;
        for (int i = 0; i < 3; i++) {
            this.departureTime[i] = departureTime[i];
        }
    }

    static int compareThem(Train a, Train b) {
        return a.destination.compareTo(b.destination);
    }
}