package by.etc.module5.task5.components.wrap;

import by.etc.module5.task5.components.Type.WrapType;

public class Paper extends Wrap {

    public Paper() {
        super();
        type = WrapType.PAPER;
    }

    @Override
    public double getRandomPrice() {
        return random.nextInt(15) + 10;
    }
}
