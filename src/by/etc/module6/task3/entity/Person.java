package by.etc.module6.task3.entity;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String name;
    private String surname;
    private Sex sex;
    private Address address;


    public Person() {
        this.name = "";
        this.surname = "";
        this.sex = Sex.MALE;
        this.address = new Address();
    }

    public Person(String name, String surname, Sex sex, Address address) {
        this();
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.address = address;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (!name.equals(person.name)) {
            return false;
        }
        if (!surname.equals(person.surname)) {
            return false;
        }
        if (sex != person.sex) {
            return false;
        }
        return address.equals(person.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Person: #%d, %s, %s, %s %s", id, surname, name, sex.toString(), address);
    }
}