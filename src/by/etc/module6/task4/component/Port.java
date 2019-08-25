package by.etc.module6.task4.component;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private int numberOfDocks;
    private int containersCapacity;
    private int numberOfContainers;

    private List<Thread> ships = new ArrayList<>();

    public Port(int numberOfDocks, int containersCapacity, int numberOfContainers) {
        this.numberOfDocks = numberOfDocks;
        this.containersCapacity = containersCapacity;
        this.numberOfContainers = numberOfContainers;
    }

    int getContainersCapacity() {
        return containersCapacity;
    }

    int getNumberOfContainers() {
        return numberOfContainers;
    }

    void addContainer() {
        numberOfContainers++;
    }

    void takeContainer() {
        numberOfContainers--;
    }


    synchronized void permissionCheck() {
        while (numberOfDocks == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ships.add(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + " has received permission");
        numberOfDocks--;
        System.out.println("Number of free docks: " + numberOfDocks + "/4\n");
    }

    synchronized void returnPermission() {
        // Expectation
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is leaving dock");

        System.out.println("Number of containers in Port: " + numberOfContainers);

        if (ships.contains(Thread.currentThread())) {
            numberOfDocks++;
            System.out.println("Number of free docks:" + numberOfDocks + "/4");
        }
        ships.remove(Thread.currentThread());
        notifyAll();
    }
}