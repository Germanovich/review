package by.etc.module5.task5.components.wrap;

import by.etc.module5.task5.components.Type.WrapType;

public class Ribbon extends Wrap {

    public Ribbon() {
        super();
        type = WrapType.RIBBON;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(20) + 15;
    }
}