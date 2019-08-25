package by.etc.module5.task4.Item.Subjects;

import by.etc.module5.task4.Item.Treasure;
import by.etc.module5.task4.Item.Type.ArmorType;

public class Armor extends Treasure {

    @Override
    public void setRandomName() {
        int value = random.nextInt(ArmorType.values().length);
        ArmorType[] types = ArmorType.values();
        setName(types[value].getName());
    }


    @Override
    public String toString() {
        return String.format("№%-5d %-12s %d gold", getId(), getName(), getValue());
    }
}
