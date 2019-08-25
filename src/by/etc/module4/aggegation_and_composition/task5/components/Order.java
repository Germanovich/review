package by.etc.module4.aggegation_and_composition.task5.components;

public class Order {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private Customer customer;
    private Tour tour;

    public Order(Customer customer, Tour tour) {
        setCustomer(customer);
        setTour(tour);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Tour getTour() {
        return tour;
    }
}
