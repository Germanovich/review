package by.etc.module5.task5.utility;

import by.etc.module5.task5.components.Bouquet;
import by.etc.module5.task5.components.flower.Flower;
import by.etc.module5.task5.components.wrap.Wrap;

class BouquetBuilder {

    private Bouquet bouquet;
    private WrapGenerator wrapGenerator;
    private FlowerGenerator flowerGenerator;
    private int numberOfFlowers;
    private int numberOfWrap;

    public BouquetBuilder() {
        bouquet = new Bouquet();
        flowerGenerator = new FlowerGenerator("Natural");
        wrapGenerator = new WrapGenerator();
        this.numberOfFlowers = 2;
        this.numberOfWrap = 2;
    }

    private int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    private int getNumberOfWrap() {
        return numberOfWrap;
    }

    public BouquetBuilder setname(String name) {
        bouquet.setName(name);
        return this;
    }

    public BouquetBuilder setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
        return this;
    }

    public BouquetBuilder setNumberOfWraps(int numberOfWrap) {
        this.numberOfWrap = numberOfWrap;
        return this;
    }

    public BouquetBuilder setTypeFlower(String producer) {
        flowerGenerator = new FlowerGenerator(producer);
        return this;
    }

    public Bouquet buildBouquet() {
        getFlowers();
        makeWrap();
        return bouquet;
    }

    public void makeWrap() {
        for (int i = 0; i < getNumberOfWrap(); i++) {
            Wrap wrap = wrapGenerator.next();
            bouquet.addWrap(wrap);
        }
    }

    public void getFlowers() {
        for (int i = 0; i < getNumberOfFlowers(); i++) {
            Flower flower = flowerGenerator.next();
            bouquet.addFlower(flower);
        }
    }
}