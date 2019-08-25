package by.etc.module4.aggegation_and_composition.task3.components;

import java.util.Arrays;

public class Region {
    private String name;
    private int area;
    private District[] districts;

    public Region(String name, District[] districts) {
        this.name = name;
        int area = 0;
        for (District district : districts) {
            area += district.getArea();
        }
        this.area = area;
        this.districts = districts;
    }

    public String toString() {
        return "Region [" + "name = " + name + ", area = " + area + ", districts = " + Arrays.toString(districts) + "]";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getArea() {
        return area;
    }

    void setArea(int area) {
        this.area = area;
    }

    District[] getDistricts() {
        return districts;
    }

    void setDistricts(District[] districts) {
        this.districts = districts;
    }
}