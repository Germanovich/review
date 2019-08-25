package by.etc.module4.classes_and_objects.task9;

import java.util.List;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(авторы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * а) список кинг заданного автора;
 * б) список книг, выпущенных заданным издательствомж
 * в) список кинг, выпущенных после заданного года.
 */

public class Class9 {
    public static void main(String[] args) {
        BookShop infoAboutBook = new BookShop();
        infoAboutBook.add(new Book("Царь в походе", new String[]{"Дроздович", "Камирович", "Соколов"},
                "Грифон", 1998, 101, 12.5, "7БЦ"));

        infoAboutBook.add(new Book("Новый море", new String[]{"Свинцов"},
                "Наука", 2001, 202, 19.5, "7Б"));

        infoAboutBook.add(new Book("Страна приключений", new String[]{"Соколов", "Камирович"},
                "Грифон", 2012, 412, 22.7, "7БЦ"));

        infoAboutBook.add(new Book("Новый Мир", new String[]{"Викторян", "Соколов"},
                "Грифон", 2000, 317, 21.1, "7БЦ"));

        infoAboutBook.add(new Book("Космос", new String[]{"Михайлов", "Камирович"},
                "Наука", 1984, 247, 15.8, "7Б"));

        infoAboutBook.add(new Book("Под океаном", new String[]{"Дроздович", "Соколов"},
                "Наука", 1988, 189, 20.3, "7Б"));

        infoAboutBook.add(new Book("Разум", new String[]{"Ростинова"}, "Наука",
                1999, 415, 35.1, "7БЦ"));

        infoAboutBook.add(new Book("Ночные сказки", new String[]{"Бкаревич", "Добрынин"},
                "Грифон", 2010, 255, 14.6, "КБС"));

        infoAboutBook.add(new Book("Бонапарт", new String[]{"Добрынин", "Камирович"},
                "Грифон", 2005, 166, 19.8, "Французский"));


        System.out.println("\nSort by author:");
        List<Book> listSortByName = infoAboutBook.getListName("Соколов");
        for (Book c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nSort by publisher:");
        List<Book> listSortByPublisher = infoAboutBook.getListPublisher("Наука");
        for (Book c : listSortByPublisher) {
            System.out.println(c);
        }

        System.out.println("\nSort by year:");
        List<Book> listSortByYear = infoAboutBook.getDiapason(2000);
        for (Book c : listSortByYear) {
            System.out.println(c);
        }
    }
}

