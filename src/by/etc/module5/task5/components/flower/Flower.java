package by.etc.module5.task5.components.flower;

import by.etc.module5.task5.components.Entity;
import by.etc.module5.task5.components.Type.FlowerType;

import java.util.Objects;

public abstract class Flower extends Entity {

    public FlowerType kind;
    private String TypeFlower;

    public Flower(String TypeFlower) {
        super();
        this.TypeFlower = TypeFlower;
    }

    public String getTypeFlower() {
        return TypeFlower;
    }

    public FlowerType getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return  getTypeFlower() + " " + kind.getName().toLowerCase() + ", price = " + getPrice() + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Flower flower = (Flower) o;

        return Objects.equals(TypeFlower, flower.TypeFlower);
    }
}