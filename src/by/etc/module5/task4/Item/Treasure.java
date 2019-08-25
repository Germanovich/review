package by.etc.module5.task4.Item;

import java.util.Random;

public abstract class Treasure implements Comparable<Treasure> {
    private static int idGeneration = 1;
    private int id = idGeneration++;
    private String name;
    private int value;
    public static Random random = new Random();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void setRandomName();

    public void setRandomValue() {
        this.value = random.nextInt(100) + 1;
    }

    @Override
    public int compareTo(Treasure o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return String.format("№%-4d %-8s %d gold", id, name, value);
    }
}
