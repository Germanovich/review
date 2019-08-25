package by.etc.module5.task5.factory;

import by.etc.module5.task5.components.Type.WrapType;
import by.etc.module5.task5.components.wrap.*;

public class WrapperSelection {
    public Wrap createWrap(String type) {
        WrapType sign = WrapType.valueOf(type);
        switch (sign) {
            case CLOTH:
                return new Cloth();
            case PAPER:
                return new Paper();
            case RIBBON:
                return new Ribbon();
            default:
                throw new EnumConstantNotPresentException(WrapType.class, sign.name());
        }
    }
}