package by.etc.module6.task3.archive;

import by.etc.module6.task3.entity.Person;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Archive extends UnicastRemoteObject implements ArchiveService{

    private static Archive instance;

    private List<Person> list;

    private Archive() throws RemoteException {
        super();
        this.list = new ArrayList<>();
    }

    public static Archive getInstance() throws RemoteException {
        if (instance == null) {
            return new Archive();
        } else {
            return instance;
        }
    }

    @Override
    public void addPerson(Person person) {
        list.add(person);
    }

    @Override
    public Person personBySurname(String surname) {
        return list.stream().filter(p -> p.getSurname().equalsIgnoreCase(surname)).findFirst().orElse(null);
    }

    @Override
    public void updatePersonById(int id, Person person) {
        list.stream().filter(p -> p.getId() == id).findFirst().ifPresent(p -> list.set(list.indexOf(p), person));
    }
}
