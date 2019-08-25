package by.etc.module4.aggegation_and_composition.task3.components;

public class District {
    private String name;
    private int area;
    private City[] cities;

    public District(String name, City[] cities) {
        this.name = name;
        int area = 0;
        for (City city : cities) {
            area += city.getArea();
        }
        this.area = area;

        this.cities = cities;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setArea(int area) {
        this.area = area;
    }

    int getArea() {
        return area;
    }

    void setCities(City[] cities) {
        this.cities = cities;
    }

    City[] getCities() {
        return cities;
    }
}
