package by.etc.module4.aggegation_and_composition.task4.components;

import java.util.Arrays;

public class Client {
    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String name;
    private Account[] accounts;
    private int numberOfAccount;

    public Client(String name, Account[] accounts) {
        setName(name);
        setAccounts(accounts);
        setNumberOfAccount(accounts.length);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Account[] getAccounts() {
        return accounts;
    }

    private void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    private int getNumberOfAccount() {
        return numberOfAccount;
    }

    private void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public void searchAccount(int checkId) {
        for (int i = 0; i < getNumberOfAccount(); i++) {
            if (checkId == getAccounts()[i].getId()) {
                System.out.println("Search was successful: " + getAccounts()[i]);
                break;
            } else {
                System.out.println("Account not found\n");
                break;
            }
        }
    }

    public void sort() {
        Arrays.sort(accounts, new AccountComparator());
    }

    public double positiveBalance() {
        double totalAmount = 0;
        for (int i = 0; i < getNumberOfAccount(); i++) {
            if (!accounts[i].block()) {
                double realBalance = accounts[i].getBalance();
                totalAmount += realBalance;
            }
        }
        return totalAmount;
    }

    public double negativeBalance() {
        double totalAmount = 0;
        for (int i = 0; i < getNumberOfAccount(); i++) {
            if (accounts[i].block()) {
                double realBalance = accounts[i].getBalance();
                totalAmount += realBalance;
            }
        }
        return totalAmount;
    }

    public String toString() {
        return "Client: " + "id = " + getId() + ", name = " + getName() + ", number of account = " +
                getNumberOfAccount() + ", accounts = " + Arrays.toString(getAccounts()) + "\n";
    }
}
