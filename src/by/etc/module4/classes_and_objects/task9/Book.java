package by.etc.module4.classes_and_objects.task9;

import java.util.Arrays;

class Book {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String name;
    public String[] author = new String[3];
    private String publisher;
    private int yearPublication;
    private int numberOfPages;
    private double price;
    private String bindingType;
    int size;
    static int maxArray;

    Book(String name, String[] author, String publisher, int YearPublication, int numberOfPages,
         double price, String bindingType) {
        size = 0;
        for (int i = 0; i < author.length; i++) {
            this.author[i] = author[i];
            size++;
        }
        if (size > maxArray) {
            setMaxArray(size);
        }
        setName(name);
        setPublisher(publisher);
        setYearPublication(YearPublication);
        setNumberOfPages(numberOfPages);
        setPrice(price);
        setBindingType(bindingType);
    }

    void setName(String name) {
        this.name = name;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    private void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    void setMaxArray(int maxArray) {
        this.maxArray = maxArray;
    }

    void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    String getBindingType() {
        return bindingType;
    }

    String getPublisher() {
        return publisher;
    }

    int getYearPublication() {
        return yearPublication;
    }

    int getNumberOfPages() {
        return numberOfPages;
    }

    private double getPrice() {
        return price;
    }

    public static int getMaxArray() {
        return maxArray;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return String.format("ID: %-4d author: %-32s name: %-22s  publisher: %-15s year: %s\t\t page: %d\t\t" +
                        " price: %.2f\t rub binding kind: %s", id, Arrays.asList(author), getName(),
                getPublisher(), getYearPublication(), getNumberOfPages(), getPrice(), getBindingType());
    }
}
