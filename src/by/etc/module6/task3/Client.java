package by.etc.module6.task3;

import by.etc.module6.task3.entity.Address;
import by.etc.module6.task3.entity.Person;
import by.etc.module6.task3.entity.Sex;
import by.etc.module6.task3.entity.Student;
import by.etc.module6.task3.archive.ArchiveService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Создайте клиент-серверное приложение "Архив".
 *
 * Общие требования к заданию:
 * 1. В архиве хранятся Дела (например, студентов). Архив находится на сервере.
 * 2. Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
 *
 * Требования к коду лабораторной работы:
 * 1. Для реализации сетевого соединения используйте сокеты.
 * 2. Формат хранения данных на сервере - xml-файлы.
 */

public class Client {

    public static void main(String[] args) {

        String localhost = "localhost";
        String hostName = "java.rmi.archive.hostname";
        String path = "rmi://localhost/Archive";

        try {

            System.setProperty(hostName, localhost);

            ArchiveService archive = (ArchiveService) Naming.lookup(path);

            Address address = new Address("Minsk", "11", "24");
            Person person = new Student("Oleg", "German", Sex.MALE, address, "JAVA Dev.");

            archive.addPerson(person);

            System.out.println(archive.personBySurname("German"));

            person.setSurname("Adamson");
            archive.updatePersonById(1, person);

            System.out.println(archive.personBySurname("Adamson"));

        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
