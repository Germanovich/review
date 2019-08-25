package by.etc.module5.task5.components.flower;

import by.etc.module5.task5.components.Type.FlowerType;

public class Hydrangea extends Flower {

    public Hydrangea(String producer) {
        super(producer);
        kind = FlowerType.HYDRANGEA;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(5) + 1;
    }
}