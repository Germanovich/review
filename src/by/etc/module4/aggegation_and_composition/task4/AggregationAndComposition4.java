package by.etc.module4.aggegation_and_composition.task4;

import by.etc.module4.aggegation_and_composition.task4.components.Account;
import by.etc.module4.aggegation_and_composition.task4.components.Bank;
import by.etc.module4.aggegation_and_composition.task4.components.Client;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class AggregationAndComposition4 {
    public static void main(String[] args) {
        Account account1 = new Account(1234, -15);
        Account account2 = new Account(1235, -1314);
        Account account3 = new Account(1236, 1241);
        Account account4 = new Account(1244, -4571);
        Account account5 = new Account(1234, -75);
        Account account6 = new Account(2345, 1555);
        Account account7 = new Account(7856, 4444);
        Account account8 = new Account(1596, -35);
        Account account9 = new Account(1478, -5789);
        Account account10 = new Account(1456, -1456);
        Account account11 = new Account(8523, -523);
        Account account12 = new Account(8456, 1478);
        Account account13 = new Account(8624, 6609);

        Client client1 = new Client("Oleg", new Account[]{account4, account7, account3});
        Client client2 = new Client("Dima", new Account[]{account1, account5, account13});
        Client client3 = new Client("German", new Account[]{account6, account2, account10, account9});
        Client client4 = new Client("Olga", new Account[]{account8, account11, account12});

        Bank bank = new Bank("Alfa-Bank", new Client[]{client1, client2, client3, client4});
        System.out.println(bank);

        System.out.println("client " + client1.getId() + " : " + client1.getName());
        int checkId = 1244;
        client1.searchAccount(checkId);

        System.out.println("client " + client2.getId() + " : " + client2.getName());
        checkId = 1111;
        client2.searchAccount(checkId);

        System.out.println("client " + client3.getName() + " enter account ID: ");
        checkId = 1235;
        client3.searchAccount(checkId);

        System.out.println("client " + client3.getName());
        System.out.println(client3);

        System.out.println("client " + client3.getName() + " after sort:");
        client3.sort();
        System.out.println(client3);

        System.out.println("\nPositive balance:");
        System.out.println(client3.getName() + ": " + client3.positiveBalance());
        System.out.println("\nNegative balance:");
        System.out.println(client3.getName() + ": " + client3.negativeBalance());
    }
}