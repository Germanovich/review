package by.etc.module4.classes_and_objects.task9;

import java.util.ArrayList;
import java.util.List;

class BookShop {
    private ArrayList<Book> bookList = new ArrayList<>();

    void add(Book book) {
        bookList.add(book);
    }

    List<Book> getListName(String authorCheck) {
        List<Book> list1 = new ArrayList<>();
        for (Book c : bookList) {
            for (int i = 0; i < Book.getMaxArray(); i++) {
                if (c.author[i] == authorCheck) {
                    list1.add(c);
                    break;
                }
            }
        }
        return list1;
    }

    List<Book> getListPublisher(String authorCheck) {
        List<Book> list2 = new ArrayList<>();
        for (Book c : bookList) {
            if (c.getPublisher() == authorCheck) {
                list2.add(c);
            }
        }
        return list2;
    }

    List<Book> getDiapason(int yearStarting) {
        List<Book> list3 = new ArrayList<>();
        for (Book c : bookList) {
            if (c.getYearPublication() > yearStarting) {
                list3.add(c);
            }
        }
        return list3;
    }
}
