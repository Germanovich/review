package by.etc.module5.task4.Utility;

import by.etc.module5.task4.Item.*;

import java.util.Collections;

public class Utils {

    private DragonCave dragonCave;

    public Treasure getTheMostExpensiveTreasure() {
        return Collections.max(dragonCave.getTreasures());
    }

    public Utils(DragonCave dragonCave) {
        setDragonCave(dragonCave);
    }

    public DragonCave getDragonCave() {
        return dragonCave;
    }

    public void setDragonCave(DragonCave dragonCave) {
        this.dragonCave = dragonCave;
    }

    public void printTreasures() {
        for (Treasure treasure : dragonCave.getTreasures()) {
            System.out.println(treasure);
        }
    }

    public int findTreasuresForSum(int sum) {
        if (sum <= 0) {
            System.out.println("Sum <= 0");
            return 0;
        }

        for (Treasure treasure : getDragonCave().getTreasures()) {
            if (sum >= treasure.getValue()) {
                System.out.println(treasure);
                sum -= treasure.getValue();
            }
        }

        return sum;
    }
}
