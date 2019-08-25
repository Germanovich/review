package by.etc.module4.classes_and_objects.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Customer, c подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные в консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * б) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

public class Class8 {
    public static void main(String[] args) {
        Shop market = new Shop();
        market.addList(new Customer("Дроздович", "Дмитрий", "Михайлович",
                "Украина", 11111111, 12345));

        market.addList(new Customer("Свинцов", "Андрей", "Иванович",
                "Россия", 22222222, 23456));

        market.addList(new Customer("Соколов", "Богдан", "Мусалинич",
                "Италия", 33333333, 34567));

        market.addList(new Customer("Викторян", "Виктор", "Викторович",
                "Украина", 44444444, 45678));

        market.addList(new Customer("Михайлов", "Франк", "Андреевич",
                "Испания", 55555555, 56789));

        market.addList(new Customer("Дроздович", "Наташа", "Алексеевна",
                "Россия", 66666666, 67890));

        market.addList(new Customer("Ростинова", "Оксана", "Ивановна",
                "Украина", 77777777, 78901));

        market.addList(new Customer("Бокаревич", "Степан", "Алексеевич",
                "Россия", 88888888, 89012));

        market.addList(new Customer("Добрынин", "Алекс", "Олегович",
                "Украина", 99999999, 10234));


        System.out.println("\nSort by name:");
        List<Customer> listSortByName = market.getListName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nPrint customers by range credit card:");
        List<Customer> listSortByRangeCreditCard = market.getDiapasonCreditCard(30000000, 80000000);
        for (Customer c : listSortByRangeCreditCard) {
            System.out.println(c);
        }
    }
}
