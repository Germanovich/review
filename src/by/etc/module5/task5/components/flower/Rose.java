package by.etc.module5.task5.components.flower;

import by.etc.module5.task5.components.Type.FlowerType;

public class Rose extends Flower {

    public Rose(String typeFlower) {
        super(typeFlower);
        kind = FlowerType.SAKURA;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(10) + 5;
    }
}
