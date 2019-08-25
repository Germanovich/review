package by.etc.module5.task5.utility;

import by.etc.module5.task5.components.wrap.Wrap;
import by.etc.module5.task5.components.Type.WrapType;
import by.etc.module5.task5.factory.WrapperSelection;

import java.util.Random;

class WrapGenerator {
    private Random random = new Random();

    private WrapperSelection wrapperSelection = new WrapperSelection();

    Wrap next() {
        return wrapperSelection.createWrap(getRandomType());
    }

    private String getRandomType(){
        WrapType type = WrapType.values()[random.nextInt(WrapType.values().length)];
        return type.name();
    }
}