package by.etc.module6.task3.archive;

import by.etc.module6.task3.entity.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArchiveService extends Remote {

    void addPerson(Person person) throws RemoteException;

    Person personBySurname(String surname) throws RemoteException;

    void updatePersonById(int id, Person person) throws RemoteException;
}