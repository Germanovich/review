package by.etc.module5.task5.components.flower;

import by.etc.module5.task5.components.Type.FlowerType;

public class Tulip extends Flower {

    public Tulip(String producer) {
        super(producer);
        kind = FlowerType.TULIP;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(20) + 15;
    }
}
