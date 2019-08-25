package by.etc.module5.task5.components.wrap;

import by.etc.module5.task5.components.Type.WrapType;

public class Cloth extends Wrap {

    public Cloth() {
        super();
        type = WrapType.CLOTH;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(5) + 1;
    }
}
