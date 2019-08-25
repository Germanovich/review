package by.etc.module5.task5.factory;

import by.etc.module5.task5.components.flower.Hydrangea;
import by.etc.module5.task5.components.flower.Rose;
import by.etc.module5.task5.components.flower.Sakura;
import by.etc.module5.task5.components.flower.Tulip;

public interface FlowerAbstract {

    Hydrangea createHydrangea();

    Sakura createSakura();

    Tulip createTulip();

    Rose createRose();
}