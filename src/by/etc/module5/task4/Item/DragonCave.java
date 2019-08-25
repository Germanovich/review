package by.etc.module5.task4.Item;

import by.etc.module5.task4.Item.Subjects.Armor;
import by.etc.module5.task4.Item.Subjects.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DragonCave {
    private List<Treasure> treasures;

    public DragonCave() {
        treasures = fillTreasures();
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    private List<Treasure> fillTreasures() {

        List<Treasure> treasureList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(2) + 1;
            Treasure treasure = createTreasure(number);
            treasure.setRandomName();
            treasure.setRandomValue();
            treasureList.add(treasure);
        }
        return treasureList;
    }

    private Treasure createTreasure(int number) {
        switch (number) {
            case 1:
                return new Armor();
            case 2:
                return new Weapon();
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}
