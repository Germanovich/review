package by.etc.module5.task4.Item.Subjects;

import by.etc.module5.task4.Item.Treasure;
import by.etc.module5.task4.Item.Type.WeaponType;

public class Weapon extends Treasure {

        @Override
        public void setRandomName() {
            int value = random.nextInt(WeaponType.values().length);
            WeaponType[] types = WeaponType.values();
            setName(types[value].getName());
        }

        @Override
        public String toString() {
            return String.format("№%-5d %-12s %d gold", getId(), getName(), getValue());
        }
    }

