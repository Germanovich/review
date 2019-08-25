package by.etc.module6.task3.entity;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String building;
    private String apartment;

    public Address() {
        this.city = "";
        this.building = "";
        this.apartment = "";
    }

    public Address(String city, String building, String apartment) {
        this.city = city;
        this.building = building;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address address = (Address) o;

        if (!city.equals(address.city)) {
            return false;
        }
        if (!building.equals(address.building)) {
            return false;
        }
        return apartment.equals(address.apartment);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + building.hashCode();
        result = 31 * result + apartment.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Address: %s %s %s", city, building, apartment);
    }
}
