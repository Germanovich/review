package by.etc.module4.aggegation_and_composition.task5.components;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    private String name;
    private List<Tour> tour;
    private List<Customer> customer;
    private List<Order> order;

    public Agency(String name) {
        this.name = name;
        tour = new ArrayList<>();
        customer = new ArrayList<>();
        order = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tour> getTour() {
        return tour;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public List<Order> getOrder() {
        return order;
    }

    public boolean addOrder(Order order) {
        return this.order.add(order);
    }

    public boolean addTour(Tour tour) {
        return this.tour.add(tour);
    }

    public boolean addClient(Customer customer) {
        return this.customer.add(customer);
    }
}
