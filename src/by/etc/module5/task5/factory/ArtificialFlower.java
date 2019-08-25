package by.etc.module5.task5.factory;

import by.etc.module5.task5.components.flower.Hydrangea;
import by.etc.module5.task5.components.flower.Rose;
import by.etc.module5.task5.components.flower.Sakura;
import by.etc.module5.task5.components.flower.Tulip;

public class ArtificialFlower implements FlowerAbstract {

    private static String typeFlower = "Artificial";

    @Override
    public Hydrangea createHydrangea() { return new Hydrangea(typeFlower); }

    @Override
    public Sakura createSakura() {
        return new Sakura(typeFlower);
    }

    @Override
    public Tulip createTulip() {
        return new Tulip(typeFlower);
    }

    @Override
    public Rose createRose() { return new Rose(typeFlower); }
}
