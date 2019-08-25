package by.etc.module4.aggegation_and_composition.task3.components;

public class State {
    private String name;
    private Region[] regions;

    public State(String name, Region[] regions) {
        this.name = name;
        this.regions = regions;
    }

    public void capital() {
        for (Region region : regions) {
            for (int i = 0; i < region.getDistricts().length; i++) {
                for (int j = 0; j < region.getDistricts()[i].getCities().length; j++) {
                    if (region.getDistricts()[i].getCities()[j].getCapital()) {
                        System.out.print("The capital of " + name + " is ");
                        System.out.print(region.getDistricts()[i].getCities()[j] + "\n");
                    }
                }
            }
        }
    }

    public void numberOfRegions() {
        System.out.println("Count numberOfRegions: " + regions.length);
    }

    public void area() {
        int s = 0;
        for (Region region : regions) {
            s += region.getArea();
        }
        System.out.println("Area: " + s);
    }

    public void regionalCenter() {
        for (Region region : regions) {
            for (int i = 0; i < region.getDistricts().length; i++) {
                for (int j = 0; j < region.getDistricts()[i].getCities().length; j++) {
                    if (region.getDistricts()[i].getCities()[j].getRegionalCenter()) {
                        System.out.print(region.getDistricts()[i].getName() + " - ");
                        System.out.print(region.getDistricts()[i].getCities()[j] + "\n");
                    }
                }
            }
        }
    }
}