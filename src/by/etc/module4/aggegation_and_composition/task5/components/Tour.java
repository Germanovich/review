package by.etc.module4.aggegation_and_composition.task5.components;

import by.etc.module4.aggegation_and_composition.task5.variety.Food;
import by.etc.module4.aggegation_and_composition.task5.variety.Purpose;
import by.etc.module4.aggegation_and_composition.task5.variety.Transport;

public class Tour {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String country;
    private String name;
    private Purpose purpose;
    private Transport transport;
    private Food food;
    private int duration;
    private int price;

    public Tour(String country, String name, Purpose purpose, Transport transport, Food food, int duration, int price) {
        setCountry(country);
        setName(name);
        setPurpose(purpose);
        setTransport(transport);
        setFood(food);
        setDuration(duration);
        setPrice(price);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("id: %-4d country: %-15s destination: %-15s purpose: %-15s transport: %-10s food: %-17s" +
                " duration: %-10d price: %d$", id, country, name, purpose, transport, food, duration, price);
    }
}
