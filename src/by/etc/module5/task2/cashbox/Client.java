package by.etc.module5.task2.cashbox;

public class Client {
    private static int idGeneration = 1;
    private int id = idGeneration++;
    private String name;
    private String surname;

    public Client(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("№%-5d %-10s, %s", getId(), getSurname(), getName());
    }
}
