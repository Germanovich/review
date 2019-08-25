package by.etc.module5.task5.utility;

import by.etc.module5.task5.components.Bouquet;
import by.etc.module5.task5.components.flower.Flower;
import by.etc.module5.task5.components.wrap.Wrap;

class BouquetUtility {

    private Bouquet bouquet;

    BouquetUtility(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    private double getTotalFlowersPrice() {
        double sum = 0;

        for (Flower flower : bouquet.getFlowers()) {
            sum += flower.getPrice();
        }

        return sum;
    }

    private double getTotalWrapsPrice() {
        double sum = 0;

        for (Wrap wrap : bouquet.getWraps()) {
            sum += wrap.getPrice();
        }

        return sum;
    }

    private double getTotalBouquetPrice() {
        return getTotalFlowersPrice() + getTotalWrapsPrice();
    }

    void printBouquet() {
        System.out.println("\nThe bouquet " + bouquet.getName() + ":");
        for (Flower flower : bouquet.getFlowers()) {
            System.out.println(flower);
        }

        System.out.println("\nThe wrap contains from: ");
        for (Wrap wrap : bouquet.getWraps()) {
            System.out.println(wrap);
        }
        System.out.println("\nTotal price: " + getTotalBouquetPrice() + "$");
    }
}
