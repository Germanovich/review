package by.etc.module5.task5.components;

import java.util.Random;

public abstract class Entity {
    private double price;
    public Random random = new Random();

    public Entity() {
        this.price = getRandomPrice();
    }

    public double getPrice() {
        return price;
    }

    public abstract double getRandomPrice();
}
