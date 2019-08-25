package by.etc.module4.aggegation_and_composition.task5;

import by.etc.module4.aggegation_and_composition.task5.components.Agency;
import by.etc.module4.aggegation_and_composition.task5.components.Customer;
import by.etc.module4.aggegation_and_composition.task5.components.Order;
import by.etc.module4.aggegation_and_composition.task5.components.Tour;
import by.etc.module4.aggegation_and_composition.task5.variety.Food;
import by.etc.module4.aggegation_and_composition.task5.variety.Purpose;
import by.etc.module4.aggegation_and_composition.task5.variety.Transport;

import java.util.List;
import java.util.ArrayList;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class AggregationAndComposition5 {
    public static void main(String[] args) {

        Tour russia = new Tour("Russia", "Fun trip",
                Purpose.RECREATION, Transport.CAR, Food.DINNER, 14, 555);
        Tour egypt = new Tour("Egypt", "Beautiful world",
                Purpose.EXCURSION, Transport.PLANE, Food.ALL_INCLUSIVE, 7, 657);
        Tour japan = new Tour("Japan", "Recovery",
                Purpose.TREATMENT, Transport.PLANE, Food.BREAKFAST, 7, 700);
        Tour poland = new Tour("Poland", "Sell-out",
                Purpose.SHOPPING, Transport.BUS, Food.DINNER, 21, 124);
        Tour southAfrica = new Tour("South Africa", "Hot spot",
                Purpose.RECREATION, Transport.PLANE, Food.BRUNCH, 28, 2000);
        Tour mexico = new Tour("Mexico", "Fun trip",
                Purpose.RECREATION, Transport.PLANE, Food.BREAKFAST, 7, 999);

        Agency agency = new Agency("World");
        agency.addTour(russia);
        agency.addTour(egypt);
        agency.addTour(japan);
        agency.addTour(poland);
        agency.addTour(southAfrica);
        agency.addTour(mexico);

        sortByPrice(agency);
        System.out.println("\nSort tour:");
        for (Tour tour : agency.getTour()) {
            System.out.println(tour);
        }

        List<Tour> list1 = getTrue(agency, Food.BREAKFAST, Transport.PLANE, 7);
        System.out.println("\nList tour by criteria:");
        for (Tour tour : list1) {
            System.out.println(tour);
        }

        List<Tour> list2 = getTrue(agency, Purpose.RECREATION, Transport.PLANE);
        System.out.println("\nList tour by criteria: ");
        for (Tour tour : list2) {
            System.out.println(tour);
        }

        List<Tour> list3 = getTrue(agency, Food.BREAKFAST);
        System.out.println("\nList tour by criteria: ");
        for (Tour tour : list3) {
            System.out.println(tour);
        }

        Customer customer1 = new Customer("Frey", "Brynjolf");
        Customer customer2 = new Customer("German", "Brown");
        agency.addClient(customer1);
        agency.addClient(customer2);
        agency.addOrder(new Order(customer1, japan));
        agency.addOrder(new Order(customer2, poland));
        System.out.println("\n" + customer1);
        System.out.println(customer2);
    }

    private static void sortByPrice(Agency agency) {

        for (int i = agency.getTour().size() - 1; i > 0; i--) {
            for (int j = 0; j < agency.getTour().size(); j++) {
                Tour buffer = agency.getTour().get(j);
                while (j > i - 1 && agency.getTour().get(j - i).getPrice() <= buffer.getPrice()) {
                    agency.getTour().set(j, agency.getTour().get(j - i));
                    j -= i;
                }
                agency.getTour().set(j, buffer);
            }
        }
    }

    private static List<Tour> getTrue(Agency agency, Food food, Transport transport, int duration) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTour()) {
            if (tour.getFood() == food && tour.getTransport() == transport && tour.getDuration() == duration) {
                tours.add(tour);
            }
        }

        return tours;
    }

    private static List<Tour> getTrue(Agency agency, Purpose purpose, Transport transport) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTour()) {
            if (tour.getPurpose() == purpose && tour.getTransport() == transport) {
                tours.add(tour);
            }
        }

        return tours;
    }

    private static List<Tour> getTrue(Agency agency, Food food) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTour()) {
            if (tour.getFood() == food) {
                tours.add(tour);
            }
        }

        return tours;
    }
}

