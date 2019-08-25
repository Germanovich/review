package by.etc.module5.task5.components;

import by.etc.module5.task5.components.flower.Flower;
import by.etc.module5.task5.components.wrap.Wrap;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private String name;
    private List<Flower> flowers;
    private List<Wrap> wraps;

    public Bouquet() {
        this.name = null;
        flowers = new ArrayList<>();
        wraps = new ArrayList<>();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Wrap> getWraps() {
        return wraps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addWrap(Wrap wrap) {
        wraps.add(wrap);
    }
}