package by.etc.module5.task5.utility;

import by.etc.module5.task5.components.flower.Flower;
import by.etc.module5.task5.components.Type.FlowerType;
import by.etc.module5.task5.factory.ArtificialFlower;
import by.etc.module5.task5.factory.FlowerAbstract;
import by.etc.module5.task5.factory.NaturalFlower;

import java.util.Random;

class FlowerGenerator {
    private Random random = new Random();
    private FlowerAbstract factory;


    Flower next() {
        return getRandomFlower(getRandomType());
    }

    private String getRandomType(){
        FlowerType type = FlowerType.values()[random.nextInt(FlowerType.values().length)];
        return type.name();
    }

    FlowerGenerator(String typeFlower) {
        setFactory(typeFlower);
    }

    private void setFactory(String typeFlower) {
        String sign = typeFlower.toUpperCase().trim();
        switch (sign) {
            case "NATURAL":
                factory = new NaturalFlower();
                break;
            case "ARTIFICIAL":
                factory = new ArtificialFlower();
                break;
            default:
                throw new IllegalArgumentException("Error: " + typeFlower);
        }
    }

    private Flower getRandomFlower(String type) {
        FlowerType sign = FlowerType.valueOf(type);
        switch (sign) {
            case SAKURA:
                return factory.createSakura();
            case TULIP:
                return factory.createTulip();
            case HYDRANGEA:
                return factory.createHydrangea();
            case ROSE:
                return factory.createRose();
            default:
                throw new IllegalArgumentException("Error: " + type);
        }
    }
}
