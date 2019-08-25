package by.etc.module5.task5.components.wrap;

import by.etc.module5.task5.components.Entity;
import by.etc.module5.task5.components.Type.WrapType;

public abstract class Wrap extends Entity {

    public WrapType type;

    public Wrap() {
        super();
    }

    public WrapType getType() {
        return type;
    }

    @Override
    public String toString() {
        return  type.getName().toLowerCase() + " price = " + getPrice() + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Wrap wrap = (Wrap) o;

        return type == wrap.type;
    }
}