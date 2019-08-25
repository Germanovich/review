package by.etc.module4.classes_and_objects.task8;

import java.util.ArrayList;
import java.util.List;

class Shop {
    private ArrayList<Customer> customersList = new ArrayList<>();

    void addList(Customer customer) {
        customersList.add(customer);
    }

    List<Customer> getListName() {
        List<Customer> list = new ArrayList<>(customersList);
        list.sort((o1, o2) -> o1.getSurname().compareToIgnoreCase(o2.getSurname()));
        return list;
    }

    List<Customer> getDiapasonCreditCard(int rangeStart, int rangeEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getCreditCardId() >= rangeStart && c.getCreditCardId() <= rangeEnd) {
                list.add(c);
            }
        }

        return list;
    }
}