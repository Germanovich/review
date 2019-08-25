package by.etc.module4.aggegation_and_composition.task5.components;

public class Customer {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String name;
    private String surname;

    public Customer(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return String.format("%d)\t Name: %-8s surname: %s", id, getName(), getSurname());
    }
}
