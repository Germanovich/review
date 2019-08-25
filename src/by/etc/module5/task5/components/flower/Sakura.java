package by.etc.module5.task5.components.flower;

import by.etc.module5.task5.components.Type.FlowerType;

public class Sakura extends Flower {

    public Sakura(String typeFlower) {
        super(typeFlower);
        kind = FlowerType.SAKURA;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(15) + 10;
    }
}