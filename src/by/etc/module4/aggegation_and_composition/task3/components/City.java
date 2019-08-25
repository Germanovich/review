package by.etc.module4.aggegation_and_composition.task3.components;

public class City {
    private String name;
    private int area;
    private boolean capital;
    private boolean regionalCenter;

    public City(String name, int area, boolean capital, boolean regionalCenter) {
        setName(name);
        setArea(area);
        setCapital(capital);
        setRegionalCenter(regionalCenter);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    int getArea() {
        return area;
    }

    private void setArea(int area) {
        this.area = area;
    }

    private void setCapital(boolean capital) {
        this.capital = capital;
    }

    boolean getCapital() {
        return capital;
    }

    private void setRegionalCenter(boolean regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    boolean getRegionalCenter() {
        return regionalCenter;
    }

    public String toString() {
        return getName() + ", area = " + getArea();
    }
}